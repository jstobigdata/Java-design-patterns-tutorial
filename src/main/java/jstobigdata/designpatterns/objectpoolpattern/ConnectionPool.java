package javadesignpatterns.creational.objectpoolpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool extends ReusablePool<Connection> {

  private String url, username, password;

  public ConnectionPool(String driver, String url, String username, String password) {
    super();
    try {
      Class.forName(driver).newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }
    this.url = url;
    this.username = username;
    this.password = password;
  }

  @Override
  protected Connection createObject() {
    try {
      return (DriverManager.getConnection(url, username, password));
    } catch (SQLException e) {
      e.printStackTrace();
      return (null);
    }
  }

  @Override
  public void expiredObject(Connection o) {
    try {
      ((Connection) o).close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public boolean validateObject(Connection o) {
    try {
      return (!((Connection) o).isClosed());
    } catch (SQLException e) {
      e.printStackTrace();
      return (false);
    }
  }
}