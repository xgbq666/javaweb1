package com.webtest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/logindemo";
    private static final String usrname = "root";
    private static final String password = "12345";

    private static Connection conn = null;

    static{
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if(conn==null){
            conn = DriverManager.getConnection(url,usrname,password);
            if(conn != null){
                System.out.println("数据库连接成功");
            }else{
                System.out.println("数据库连接失败");
            }
            return conn;
        }
        return conn;
    }

}
