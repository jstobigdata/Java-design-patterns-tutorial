package javadesignpatterns.structural.adapter;

public class StudentInfoStringarray {

  public static String[][] getStudents() {
    String[][] students = new String[4][];

    students[0] = new String[] { "100", "Ahmad" };
    students[1] = new String[] { "101", "Ana" };
    students[2] = new String[] { "102", "Barbara" };
    students[3] = new String[] { "103", "Chloe" };

    return students;
  }

  public static void main(String args[]) {

    ITarget target = new StudentAdapter();
    System.out.println("School system passes students string array to the Adapter class\n");
    target.processStudenttoSection(getStudents());
  }
}