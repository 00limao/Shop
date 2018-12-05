package com.jinx.Dao;

import com.jinx.DBUtils.DBUtils;


import java.sql.*;

/**
 * 工具类
 */
public class UserDao {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop1", "root", "123456");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public boolean isExists(String username,String password)
    {
        Connection connection = DBUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username = ? and password = ?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        boolean result = userDao.isExists("张","123456");
        System.out.println(result);
    }


}
