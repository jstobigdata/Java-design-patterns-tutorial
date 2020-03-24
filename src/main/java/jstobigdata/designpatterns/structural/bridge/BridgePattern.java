package javadesignpatterns.structural.bridge;

// Demonstration of bridge design pattern 
class BridgePattern {
  public static void main(String[] args) {
    ElectronicItem item1 = new Tv(new Configured(), new Released());
    item1.produce();
    ElectronicItem item2 = new Mobile(new Configured(), new Released());
    item2.produce();
  }
} 