package com.project.Day02;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/4 15:28
 * @Version 1.0
 */
public class JDBCUtils {
    // 获得c3p0连接池对象
    private static ComboPooledDataSource ds = new ComboPooledDataSource("mysql");

    /**
     * 获得数据库连接对象
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 获得c3p0连接池对象
     *
     * @return
     */
    public static DataSource getDataSource() {
        return ds;
    }

//    public static void main(String[] args) {
//        System.out.println("----------" + JDBCUtils.getDataSource());
//
//    }
}