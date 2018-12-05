package com.jinx.Dao;

import com.jinx.DBUtils.DBUtils;
import com.jinx.projos.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UsersDao {

    @Override
    public boolean addOneUser(User user) {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into user(username,password,email,phone) values (?,?,?,?)");
            preparedStatement.setString(1,user.getUserName() );
            preparedStatement.setString(2,user.getPassWord());
            preparedStatement.setString(3,user.geteMail());
            preparedStatement.setString(4,user.getPhone());
            int result = preparedStatement.executeUpdate();
            if(result!=0)
            {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResult(connection,preparedStatement,null);
        }
        return false;
    }
}
