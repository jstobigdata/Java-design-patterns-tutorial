package javadesignpatterns.structural.bridge;

// Concrete implementation 1 for bridge pattern 
public class Configured implements Factory{
  @Override
  public void production() {
    System.out.print("Configured");
  }
}
