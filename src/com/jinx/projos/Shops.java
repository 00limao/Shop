package com.jinx.projos;

import java.math.BigDecimal;

public class Shops {
    private Integer shop_id;
    private String shop_name;
    private String shop_img;
    private String shop_des;
    private BigDecimal shop_price;
    private Integer type_id;
    private Integer shop_stock;

    public Shops(Integer shop_id, String shop_name, String shop_img, String shop_des, BigDecimal shop_price, Integer type_id, Integer shop_stock) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shop_img = shop_img;
        this.shop_des = shop_des;
        this.shop_price = shop_price;
        this.type_id = type_id;
        this.shop_stock = shop_stock;
    }

    public Shops() {
    }

    public Shops(String shop_name) {

    }


    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_img() {
        return shop_img;
    }

    public void setShop_img(String shop_img) {
        this.shop_img = shop_img;
    }

    public String getShop_des() {
        return shop_des;
    }

    public void setShop_des(String shop_des) {
        this.shop_des = shop_des;
    }

    public BigDecimal getShop_price() {
        return shop_price;
    }

    public void setShop_price(BigDecimal shop_price) {  this.shop_price = shop_price; }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getShop_stock() {
        return shop_stock;
    }

    public void setShop_stock(Integer shop_stock) {
        this.shop_stock = shop_stock;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "shop_id=" + shop_id +
                ", shop_name='" + shop_name + '\'' +
                ", shop_img='" + shop_img + '\'' +
                ", shop_des='" + shop_des + '\'' +
                ", shop_price=" + shop_price +
                ", type_id=" + type_id +
                ", shop_stock=" + shop_stock +
                '}';
    }
}
