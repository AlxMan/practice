package com.project.Day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/4 14:24
 * @Version 1.0
 */
public class AddDataToDB {
    public static final String URL = "jdbc:mysql://localhost:3306/testkf?useUnicode=true&useJDBCCompliantTimezoneShift=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";
    public static Connection getCon(){
//        //加载驱动
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        //获取数据库连接
//            Connection coon = DriverManager.getConnection(URL,USER,PASSWORD);
//            return coon;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
        //连接池改造
        try {
            return JDBCUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void add(String loginName,String passWord){
        String sql = "INSERT INTO user(uid, loginName, passWord) values(?,?,?)";
        Connection conn=getCon();
        //预编译SQL，减少sql执行
        try {
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setString(1,UUID.randomUUID().toString());
            ptmt.setString(2,loginName);
            ptmt.setString(3,passWord);
            ptmt.execute();//执行
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void delete(){
        String sql = "delete from user";
        Connection conn=getCon();
        try {
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        delete();
        for (int i=0;i<10;i++) {
            add("test"+i,"test"+i);
        }
    }
}