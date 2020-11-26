package JDBC;

import java.sql.*;

public class Java_Mysql8 {

    static final String url = "jdbc:mysql://localhost:3306/student?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String user = "root";
    static final String pass = "745700yxy";

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("com.mysql.jdbc.Driver"); //加载驱动
        System.out.println("驱动加载完成...");
        Thread.sleep(1000);
        System.out.println("连接数据库...");
        Connection connection = DriverManager.getConnection(url,user,pass); //连接数据库
        Thread.sleep(1000);
        System.out.println("建立查询...");
        Statement statement = connection.createStatement();

        //数据库查
        String sql = "select * from stu";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.print("Sno: "+resultSet.getString("Sno")+"\t");
            System.out.print("Sname: "+resultSet.getString("Sname")+"\t");
            System.out.print("Ssex: "+resultSet.getString("Ssex")+"\t");
            System.out.print("Sage: "+resultSet.getInt("Sage")+"\t");
            System.out.print("Sdept: "+resultSet.getString("Sdept")+"\t");
            System.out.print("Szzmm: "+resultSet.getString("Szzmm")+"\n");
        }
        System.out.println("查询结束！");

        //数据库增删改
        int count;
        String insert_sql = "insert into stu values ('95010','李凯','男','23','CS','群众')";
        String update_sql = "update stu set Sage=22 where Sno = '95010'";
        String delete_sql = "delete from stu where Sname = '95009'";

        count = statement.executeUpdate(insert_sql);
        System.out.println("添加了"+count+"条记录到stu表中！");

        count = statement.executeUpdate(update_sql);
        System.out.println("修改了"+count+"条记录！");

        count = statement.executeUpdate(delete_sql);
        System.out.println("删除了"+count+"条记录！");

        try {
            if (resultSet!=null) resultSet.close();
            if (statement!=null) statement.close();
            if (connection!=null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}