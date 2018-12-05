package com.jinx.Dao;

import com.jinx.DBUtils.DBUtils;
import com.jinx.projos.Shops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDao {
    public void UpdateDate(Shops shops){
        System.out.println("dao:"+shops.toString());
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("update shops set type_id=?,shop_name=?,shop_img=?,shop_des=?,shop_price=?,shop_stock=? where shop_id=?");
            preparedStatement.setInt(1,shops.getType_id());
            preparedStatement.setString(2,shops.getShop_name());
            preparedStatement.setString(3,shops.getShop_img());
            preparedStatement.setString(4,shops.getShop_des());
            preparedStatement.setBigDecimal(5,shops.getShop_price());
            preparedStatement.setInt(6,shops.getShop_stock());
            preparedStatement.setInt(7,shops.getShop_id());
            int i = preparedStatement.executeUpdate();
            System.out.println("result:"+i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResult(connection,preparedStatement,null);
        }
    }
}
