package javadesignpatterns.structural.bridge;

// Concrete implementation 2 for bridge pattern 
public class Released implements Factory {
  @Override
  public void production() {
    System.out.print(" And");
    System.out.println(" Released.");
  }
}