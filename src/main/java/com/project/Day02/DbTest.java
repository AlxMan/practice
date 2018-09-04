package com.project.Day02;

import java.sql.*;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/4 15:14
 * @Version 1.0
 */
public class DbTest {
    public static final String URL = "jdbc:mysql://localhost:3306/testkf?useUnicode=true&useJDBCCompliantTimezoneShift=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建连接
            Connection conn=DriverManager.getConnection(URL,USER,PASSWORD);
            //操作数据库
            Statement stms =  conn.createStatement();
            ResultSet rs = stms.executeQuery("select * from user");
            while (rs.next()){
                System.out.println(rs.getString("uid")+"-->名称："+rs.getString("loginName")+"-->密码："+rs.getString("passWord"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}