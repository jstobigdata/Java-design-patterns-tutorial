package javadesignpatterns.structural.bridge;

public class Tv extends ElectronicItem {
  public Tv(Factory factory1, Factory factory2) {
    super(factory1, factory2);
  }

  @Override
  public void produce() {
    System.out.print("Tv ");
    factory1.production();
    factory2.production();
  }
}