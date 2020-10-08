package jdbc.demo2;

import java.sql.*;

/**
 * PreparedStatement测试
 */
public class PreparedStatementTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC";
        String username="root";
        String password="143188";
        //创建链接
        Connection connection = DriverManager.getConnection(url, username, password);
        //sql语句，?为参数占位符
        String sql = "select * from ssm_item where item_id =?";
        //创建数据库操作对象,同时预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //传递参数
        preparedStatement.setInt(1,147);
        //sql执行结果
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("item_id"));
        }
        //关闭连接
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
