package jstobigdata.designpatterns.singleton.realworldexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static DbConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/jdbc";
    private String username = "root";
    private String password = "root";

    private DbConnection() throws SQLException {
        try {
            Class.forName("org.mysql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Something is weong with the DB connection String : " + ex.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }

    public static DbConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DbConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DbConnection();
        }
        return instance;
    }
}
