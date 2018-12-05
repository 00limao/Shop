package com.jinx.business;

import com.jinx.Dao.SelectDao;
import com.jinx.Dao.SelectDaoImpl;
import com.jinx.Dao.UpdateDao;
import com.jinx.projos.PageBean;
import com.jinx.projos.Shops;

import java.util.List;

public class ShopBusinessImpl implements ShopBusiness {

    private SelectDao selectDao = new SelectDaoImpl();
    private UpdateDao updateDao = new UpdateDao();

    @Override
    public List<Shops> AllDate() {
        return selectDao.getAllshop();
    }

    @Override
    public Shops getOneShop(int id) {
        return selectDao.getOneDate(id);
    }

    @Override
    public void UpdateDao(Shops shops) {
        System.out.println("business"+shops);
        updateDao.UpdateDate(shops);
    }
    @Override
    //根据当前页数和每页记录查询
    public PageBean getShopByPaging(int pageNum, int pageSize){
        //查询所有记录
        int allRecords = selectDao.getAllRecords();
        //构建PageBean对象
        PageBean pageBean = new PageBean(pageNum,pageSize,allRecords);
        //拿到PageBean中的开始索引
        Integer startIndex = pageBean.getStartIndex();
        //根据索引和页面数量查询商品
        List<Shops> shopByLimit = selectDao.getShopByLimit(startIndex, pageSize);
        pageBean.setShops(shopByLimit);
        return  pageBean;
    }
}
