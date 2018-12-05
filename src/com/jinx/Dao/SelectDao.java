package com.jinx.Dao;

import com.jinx.projos.Shops;

import java.util.List;

public interface SelectDao {
    public List<Shops> getAllshop();

    public Shops getOneDate(int shop_id);

    public int getAllRecords();

    public List<Shops> getShopByLimit(int startIndex,int pageSize);
}
