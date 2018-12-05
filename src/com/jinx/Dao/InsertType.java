package com.jinx.Dao;

import com.jinx.DBUtils.DBUtils;
import com.jinx.projos.Type;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertType {
    public boolean InsertTypeDate(Type type){
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into type (type_id,type_name) values (?,?)");
            preparedStatement.setInt(1,type.getType_id());
            preparedStatement.setString(2,type.getType_name());
            int i = preparedStatement.executeUpdate();
            if (i>0){
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
