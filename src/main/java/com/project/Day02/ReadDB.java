package com.project.Day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 读取数据库封装到对象里
 * @Author wangxianchao
 * @Date 2018/9/4 16:12
 * @Version 1.0
 */
public class ReadDB {
    public static List<TestUser> query(){
        Connection conn = null;
        List<TestUser> list = new ArrayList<TestUser>();
        try {
            conn=JDBCUtils.getConnection();
            Statement stmt = conn.createStatement();//用于执行SQL语句的对象
            ResultSet resultSet = stmt.executeQuery("select * from user");//结果集，调用Statement对象的excuteQuery(sql)方法可以得到结果集
            TestUser user;
            while (resultSet.next()){
                user = new TestUser();
                user.setUid(resultSet.getString("uid"));
                user.setLoginName(resultSet.getString("loginName"));
                user.setPassWord(resultSet.getString("passWord"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}