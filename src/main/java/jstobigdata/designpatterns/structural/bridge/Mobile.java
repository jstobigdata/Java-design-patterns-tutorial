package javadesignpatterns.structural.bridge;

// Refine abstraction 2 in bridge pattern 
public class Mobile extends ElectronicItem {
  public Mobile(Factory factory1, Factory factory2) {
    super(factory1, factory2);
  }

  @Override
  public void produce() {
    System.out.print("Mobile ");
    factory1.production();
    factory2.production();
  }
}