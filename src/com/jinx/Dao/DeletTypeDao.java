package com.jinx.Dao;

import com.jinx.DBUtils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletTypeDao {
    public int DelTypeDate(int type_id){
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("delete from type where type_id= ?");
            preparedStatement.setInt(1,type_id);
            int i = preparedStatement.executeUpdate();
            return  i;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResult(connection,preparedStatement,null);
        }
        return 0;
    }
}
