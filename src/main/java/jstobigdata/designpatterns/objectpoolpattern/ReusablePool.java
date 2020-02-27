package javadesignpatterns.creational.objectpoolpattern;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ReusablePool<T> {
  private long expirationTime;

  private Hashtable<T, Long> lock, unlock;

  public ReusablePool() {
    expirationTime = 50000; // 50 seconds
    lock = new Hashtable<T, Long>();
    unlock = new Hashtable<T, Long>();
  }

  protected abstract T createObject();

  public abstract boolean validateObject(T o);

  public abstract void expiredObject(T o);

  public synchronized T getInstance() {
    long now = System.currentTimeMillis();
    T t;
    if (unlock.size() > 0) {
      Enumeration<T> e = unlock.keys();
      while (e.hasMoreElements()) {
        t = e.nextElement();
        if ((now - unlock.get(t)) > expirationTime) {
          // object has expired
          unlock.remove(t);
          expiredObject(t);
          t = null;
        } else {
          if (validateObject(t)) {
            unlock.remove(t);
            lock.put(t, now);
            return (t);
          } else {
            // object failed validation
            unlock.remove(t);
            expiredObject(t);
            t = null;
          }
        }
      }
    }
    // no objects available, create a new one
    t = createObject();
    lock.put(t, now);
    return (t);
  }

  public synchronized void releaseObject(T t) {
    lock.remove(t);
    unlock.put(t, System.currentTimeMillis());
  }
}
