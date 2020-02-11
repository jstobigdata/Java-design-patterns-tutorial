package javadesignpatterns.creational.prototype;

public class Clothes {

  private String clothtype;
  private int clothsku;

  public String getClothtype() {
    return clothtype;
  }

  public void setClothtype(String clothtype) {
    this.clothtype = clothtype;
  }

  public int getClothsku() {
    return clothsku;
  }

  public void setClothsku(int clothsku) {
    this.clothsku = clothsku;
  }

  @Override
  public String toString() {
    return "Clothes [clothtype=" + clothtype + ", clothsku=" + clothsku + "]";
  }

}
