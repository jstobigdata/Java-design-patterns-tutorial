package javadesignpatterns.structural.bridge;

public abstract class ElectronicItem {
  protected Factory factory1;
  protected Factory factory2;

  protected ElectronicItem(Factory factory1, Factory factory2) {
    this.factory1 = factory1;
    this.factory2 = factory2;
  }

  abstract public void produce();
}
