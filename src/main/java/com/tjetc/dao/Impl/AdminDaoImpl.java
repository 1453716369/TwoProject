package com.tjetc.dao.Impl;

import com.tjetc.DButil.JDBCUtils;
import com.tjetc.dao.AdmainDao;
import com.tjetc.domain.Admain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements AdmainDao {
    JDBCUtils jdbcutils= new JDBCUtils();
    @Override
    public List<Admain> findAllUser() {
        List<Admain> list = new ArrayList<Admain>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = jdbcutils.getConnection();
            String sql="select * from admin";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Admain admain = new Admain(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(admain);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(rs,ps,conn);
        return list;
    }

    @Override
    public int addUser(Admain admin) {
        Connection conn = null;
        PreparedStatement ps = null;
        int i = 0;
        try {
            conn = jdbcutils.getConnection();
            String sql="insert  into admin(id,type,password)value (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,admin.getId());
            ps.setString(2,admin.getType());
            ps.setString(3,admin.getPassword());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(ps,conn);
        return i;
    }

    @Override
    public int delUser(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        int i = 0;
        try {
            conn = jdbcutils.getConnection();
            String sql="delete from admin where id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(ps,conn);
        return i;
    }

    @Override
    public int update(Admain admin) {
        Connection conn = null;
        PreparedStatement ps = null;·
        int i = 0;
        try {
            conn = jdbcutils.getConnection();
            String sql="update admin set id=?,type=?,password=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,admin.getId());
            ps.setString(2,admin.getType());
            ps.setString(3,admin.getPassword());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcutils.release(ps,conn);
        return i;
    }
}
