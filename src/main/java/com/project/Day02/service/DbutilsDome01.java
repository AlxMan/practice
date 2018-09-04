package com.project.Day02.service;

import com.project.Day02.entify.User;
import com.project.Day02.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * @Description 使用dbutils增删改查
 * @Author wangxianchao
 * @Date 2018/9/4 17:27
 * @Version 1.0
 */
public class DbutilsDome01 {
    @Test
    public void insert() throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
        Object[] params = {1, "刘德华", "55", "liudehua@163.com", new Date()};
        runner.update(sql, params);
    }
    @Test
    public void update() throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "update users set email=? where id=?";
        Object[] params = {"yeyiyi@126.com", 1};
        runner.update(sql, params);
    }
    @Test
    public void delete() throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "delete from users where id=?";
        runner.update(sql, 2);
    }
    @Test
    public void find() throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "select * from users where id=?";
        User user = (User) runner.query(sql, 1, new BeanHandler(User.class));
        System.out.println(user.getEmail());
    }

    @Test
    public void getAll() throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "select * from users";
        List list = (List) runner.query(sql, new BeanListHandler(User.class));
        System.out.println(list);
    }

    @Test
    public void batch() throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
        Object[][] params = new Object[3][5];
        for (int i = 0; i < params.length; i++) {
            params[i] = new Object[]{i+1, "aa"+i, "123", i+"@sian.com", new Date()};
        }
        runner.batch(sql, params);
    }
}