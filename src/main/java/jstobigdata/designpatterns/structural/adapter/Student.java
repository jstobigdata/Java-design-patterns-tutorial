package javadesignpatterns.structural.adapter;

public class Student {

  private int rollid;
  private String studentname;

  public Student(int rollid, String studentname) {
    super();
    this.rollid = rollid;
    this.studentname = studentname;
  }

  public int getRollid() {
    return rollid;
  }

  public void setRollid(int rollid) {
    this.rollid = rollid;
  }

  public String getStudentname() {
    return studentname;
  }

  public void setStudentname(String studentname) {
    this.studentname = studentname;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

}
