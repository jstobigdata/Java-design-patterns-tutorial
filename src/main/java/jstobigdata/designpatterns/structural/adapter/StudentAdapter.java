package javadesignpatterns.structural.adapter;

import java.util.ArrayList;

public class StudentAdapter implements ITarget {
  Thirdpartysystem thirdPartyBillingSystem = new Thirdpartysystem();

  @Override
  public void processStudenttoSection(String[][] studentinfo) {
    String rollId = null;
    String studentname = null;
    ArrayList<Student> studentlist = new ArrayList<Student>();
    for (int i = 0; i < studentinfo.length; i++) {

      for (int j = 0; j < studentinfo[i].length; j++) {
        if (j == 0) {
          rollId = studentinfo[i][j];
        } else {
          studentname = studentinfo[i][j];
        }
        studentlist.add(new Student(Integer.parseInt(rollId), studentname));

      }

      System.out.println("Adapter class converted Array of students to ArrayList of Student : \n" + studentlist + "\n"
          + "then delegate to the Thirdpartysystem for processing the students into section");
      thirdPartyBillingSystem.processSection(studentlist);

    }

  }
}