package com.jinx.Dao;


import com.jinx.DBUtils.DBUtils;
import com.jinx.projos.Type;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectTypeDao {
    public List<Type> SelectTypeDate() {
        Connection connection = DBUtils.getConnection();
        List<Type> types = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select * from type");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                int type_id = resultSet.getInt("type_id");
                String type_name = resultSet.getString("type_name");
                Type type = new Type(type_id,type_name);
                types.add(type);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResult(connection,preparedStatement,resultSet);
        }
        return types;
    }


}
