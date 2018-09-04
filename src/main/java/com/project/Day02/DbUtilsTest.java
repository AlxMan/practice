package com.project.Day02;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/4 16:05
 * @Version 1.0
 */
public class DbUtilsTest {
    public static void main(String[] args) {
        QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from user";
        try {
            List<TestUser> list = (List<TestUser>) runner.query(sql, new BeanListHandler(TestUser.class));
            System.out.println(list.size());
            for (TestUser testUser : list) {
                System.out.println(testUser);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}