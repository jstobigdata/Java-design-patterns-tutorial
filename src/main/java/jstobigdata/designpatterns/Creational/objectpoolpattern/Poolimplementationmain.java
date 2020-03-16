package javadesignpatterns.creational.objectpoolpattern;

import java.sql.Connection;

public class Poolimplementationmain {

  public static void main(String[] args) {
    ConnectionPool reusablepool = new ConnectionPool( "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/dbname","usernname", "password");
    Connection con = reusablepool.getInstance();
     
    // Use Connection object as per the requirement.
    
     
    reusablepool.releaseObject(con);
    
  }
}
