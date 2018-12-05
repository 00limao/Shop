package com.jinx.Dao;

import com.jinx.DBUtils.DBUtils;
import com.jinx.projos.Shops;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectDaoImpl implements SelectDao {
    @Override
    public List<Shops> getAllshop() {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Shops> lists = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select * from shops");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int shop_id = resultSet.getInt("shop_id");
                String shop_name = resultSet.getString("shop_name");
                String shop_img = resultSet.getString("shop_img");
                String shop_des = resultSet.getString("shop_des");
                BigDecimal shop_price = resultSet.getBigDecimal("shop_price");
                int type_id = resultSet.getInt("type_id");
                int shop_stock = resultSet.getInt("shop_stock");
                Shops shop = new Shops(shop_id, shop_name, shop_img, shop_des, shop_price, type_id, shop_stock);
                lists.add(shop);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            {
                DBUtils.closeResult(connection, preparedStatement, resultSet);
            }
        }
        return lists;
    }

    @Override
    public Shops getOneDate(int id) {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select * from shops where shop_id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int shop_id = resultSet.getInt("shop_id");
                String shop_name = resultSet.getString("shop_name");
                String shop_img = resultSet.getString("shop_img");
                String shop_des = resultSet.getString("shop_des");
                BigDecimal shop_price = resultSet.getBigDecimal("shop_price");
                int type_id = resultSet.getInt("type_id");
                int shop_stock = resultSet.getInt("shop_stock");
                Shops shop = new Shops(shop_id, shop_name, shop_img, shop_des, shop_price, type_id, shop_stock);
                return shop;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            {
                DBUtils.closeResult(connection, preparedStatement, null);
            }
        }
        return null;
    }

    @Override
    public int getAllRecords() {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT  count(*) as count from shops");
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return resultSet.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeResult(connection, preparedStatement, null);
        }
        return 0;
    }

    @Override
    public List<Shops> getShopByLimit(int startIndex, int pageSize) {

        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        List<Shops> shops = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select * from shops limit ?,?");
            preparedStatement.setInt(1,startIndex);
            preparedStatement.setInt(2,pageSize);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                int type_id = resultSet.getInt("type_id");
                int shop_id = resultSet.getInt("shop_id");
                String shop_name = resultSet.getString("shop_name");
                String shop_img = resultSet.getString("shop_img");
                String shop_des = resultSet.getString("shop_des");
                String shop_price = resultSet.getString("shop_price");
                BigDecimal s_price = new BigDecimal(shop_price);
                int shop_stock = resultSet.getInt("shop_stock");
                Shops shops1 = new Shops(shop_id,shop_name,shop_img,shop_des,s_price,type_id,shop_stock);
                shops.add(shops1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResult(connection,preparedStatement,resultSet);
        }
        return shops;
    }
    }

