package JDBC;

import java.sql.*;

public class Java_Mysql8 {

    static final String url = "jdbc:mysql://localhost:3306/student?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String user = "root";
    static final String pass = "745700yxy";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("连接数据库...");
        Connection connection = DriverManager.getConnection(url,user,pass);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from stu");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("Sname"));
        }
    }
}