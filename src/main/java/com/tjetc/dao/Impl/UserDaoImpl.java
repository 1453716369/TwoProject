package com.tjetc.dao.Impl;

import com.tjetc.DButil.JDBCUtils;
import com.tjetc.dao.UserDao;
import com.tjetc.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    JDBCUtils jdbcutils= new JDBCUtils();
    @Override
    public List<User> findAllUser() {
        List<User> list = new ArrayList<User>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = jdbcutils.getConnection();
            String sql="select * from user";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                User user = new User(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(rs,ps,conn);
        return list;
    }

    @Override
    public int addUser(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        int i = 0;
        try {
            conn = jdbcutils.getConnection();
            String sql="insert  into user(account,phone,password,adress)value (?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,user.getAccount());
            ps.setInt(2,user.getPhone());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getAdress());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(ps,conn);
        return i;
    }

    @Override
    public int delUser(String account) {
        Connection conn = null;
        PreparedStatement ps = null;
        int i = 0;
        try {
            conn = jdbcutils.getConnection();
            String sql="delete from user where account=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,account);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(ps,conn);
        return i;
    }

    @Override
    public int update(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        int i = 0;
        try {
            conn = jdbcutils.getConnection();
            String sql="update user set account=?,phone=?,password=?,adress=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,user.getAccount());
            ps.setInt(2,user.getPhone());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getAdress());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(ps,conn);
        return i;
    }
}
