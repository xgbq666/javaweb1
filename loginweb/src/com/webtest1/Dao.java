package com.webtest1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

    public static boolean SearchUser(String username,String userpassword){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBHelper.getConnection();
            String sql ="select * from test_emp1 where name =? and password=?";
            stmt = conn.prepareStatement(sql);

            stmt.setString(1,username);
            stmt.setString(2,userpassword);

            rs = stmt.executeQuery();
            if (rs.next()){
                return true;
            }else{
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static void InsertUser(String username,String userpassword){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBHelper.getConnection();
            String sql ="insert into test_emp1(name,password) values(?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,username);
            stmt.setString(2,userpassword);
            stmt.executeUpdate();
            System.out.println("插入数据成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
