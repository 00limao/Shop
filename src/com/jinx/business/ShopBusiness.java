package com.jinx.business;

import com.jinx.Dao.SelectDao;
import com.jinx.Dao.SelectDaoImpl;
import com.jinx.projos.PageBean;
import com.jinx.projos.Shops;

import java.util.List;

public interface ShopBusiness {
    public List<Shops> AllDate();

    public Shops getOneShop(int id);

    public void UpdateDao(Shops shops);

    public PageBean getShopByPaging(int pageNum, int pageSize);

}
