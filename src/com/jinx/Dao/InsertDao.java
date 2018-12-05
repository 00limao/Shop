package com.jinx.Dao;

import com.jinx.DBUtils.DBUtils;
import com.jinx.projos.Shops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDao {
    public boolean InsertDate(Shops shops){
        System.out.println("Dao:"+shops.toString());
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into shops (shop_name,shop_img,shop_des,shop_price,type_id,shop_stock) values (?,?,?,?,?,?)");
            preparedStatement.setString(1,shops.getShop_name());
            preparedStatement.setString(2,shops.getShop_img());
            preparedStatement.setString(3,shops.getShop_des());
            preparedStatement.setBigDecimal(4,shops.getShop_price());
            preparedStatement.setInt(5,shops.getType_id());
            preparedStatement.setInt(6,shops.getShop_stock());
            int i = preparedStatement.executeUpdate();
            if( i > 0)
            {
                return  true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResult(connection,preparedStatement,null);
        }
        return false;

    }
}
