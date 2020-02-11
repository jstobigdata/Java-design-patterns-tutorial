package javadesignpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Apparelstore implements Cloneable {

  private String storename;
  List<Clothes> cloth = new ArrayList<>();

  public String getStorename() {
    return storename;
  }

  public void setStorename(String storename) {
    this.storename = storename;
  }

  public List<Clothes> getCloth() {
    return cloth;
  }

  public void setcloth(List<Clothes> cloth) {
    this.cloth = cloth;
  }

  public void fetchData() {

    for (int i = 0; i < 15; i++) {

      Clothes cloth = new Clothes();

      cloth.setClothsku(i);
      cloth.setClothtype("Type is  " + i);
      getCloth().add(cloth);
    }
  }

  @Override
  public String toString() {
    return "Apparelstore [storename=" + storename + ", cloth=" + cloth + "]";
  }

  /*
   * @Override //shallow copy 
   * protected Object clone() throws CloneNotSupportedException 
   *  { 
   *    return super.clone(); 
   *  }
   */

  @Override // Deep copy
  protected Apparelstore clone() throws CloneNotSupportedException {
    Apparelstore appstore = new Apparelstore();

    for (Clothes cl : this.getCloth()) {
      appstore.getCloth().add(cl);
    }

    return appstore;
  }
}
