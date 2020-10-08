package jdbc.demo1;

import java.sql.*;

/**
 * Statement存在SQL注入问题
 */
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String itemId = "0 or 1=1";

        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC";
        String username="root";
        String password="143188";
        //创建链接
        Connection connection = DriverManager.getConnection(url, username, password);
        //创建数据库操作对象
        Statement statement = connection.createStatement();
        //sql语句
        String sql = "select * from ssm_item where item_id = "+itemId;
        //sql执行结果
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getInt("item_id"));
        }
        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
