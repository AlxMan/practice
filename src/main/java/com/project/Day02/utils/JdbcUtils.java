package com.project.Day02.utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description 获取数据库连接的工具类
 * @Author wangxianchao
 * @Date 2018/9/4 17:11
 * @Version 1.0
 */
public class JdbcUtils {
    private static DataSource dataSoure=null;
    static {
        Properties prop = new Properties();
        InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            prop.load(inputStream);
            BasicDataSourceFactory factory = new BasicDataSourceFactory();
            try {
                dataSoure = factory.createDataSource(prop);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource() {
        return dataSoure;
    }

    public static Connection getConnection() throws SQLException {
        return dataSoure.getConnection();
    }
}