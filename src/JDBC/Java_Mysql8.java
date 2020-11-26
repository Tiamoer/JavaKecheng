package JDBC;

import java.sql.*;

public class Java_Mysql8 {

    static final String url = "jdbc:mysql://localhost:3306/student?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String user = "root";
    static final String pass = "745700yxy";

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("驱动加载完成...");
        Thread.sleep(1000);
        System.out.println("连接数据库...");
        Connection connection = DriverManager.getConnection(url,user,pass);
        Thread.sleep(1000);
        System.out.println("建立查询...");
        Statement statement = connection.createStatement();
        String sql = "select * from stu";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.print("Sno: "+resultSet.getString("Sno")+"\t");
            System.out.print("Sname: "+resultSet.getString("Sname")+"\t");
            System.out.print("Ssex: "+resultSet.getString("Ssex")+"\t");
            System.out.print("Sdept: "+resultSet.getString("Sdept")+"\t");
            System.out.print("Szzmm: "+resultSet.getString("Szzmm")+"\n");
        }
        System.out.println("查询结束！");
        try {
            if (resultSet!=null) resultSet.close();
            if (statement!=null) statement.close();
            if (connection!=null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}