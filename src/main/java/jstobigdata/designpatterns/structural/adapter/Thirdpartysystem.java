package javadesignpatterns.structural.adapter;

import java.util.ArrayList;

public class Thirdpartysystem {
  public void processSection(ArrayList<Student> studentlist) {
    for (Student student : studentlist) {

      System.out.print("\n" + studentlist.toString() + " : ");

      // Grading Logic Go Here,
    }
  }

}