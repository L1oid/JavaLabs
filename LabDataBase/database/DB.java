package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
    static Connection connection;
    String username;
    String password;

    public DB(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Connection getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e){}
        return connection;
    }

    public static ResultSet exeQuery(String query){
        ResultSet rs = null;
        try {
            rs = connection.createStatement().executeQuery(query);
        } catch (SQLException e) {}
        return rs;
    }

    public static void exeUpdate(String query){
        try {
            connection.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
