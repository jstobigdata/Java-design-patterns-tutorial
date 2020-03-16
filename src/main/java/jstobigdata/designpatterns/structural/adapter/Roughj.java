package javadesignpatterns.structural.adapter;

public class Roughj {

}

interface clientInterface {
  void write();
}
class Serviceclass {
  public void mark() {}
}
class ObjectAdapter implements clientInterface {
  Serviceclass sc = new Serviceclass();
  @Override
  public void write() {
    sc.mark();
  }
}
