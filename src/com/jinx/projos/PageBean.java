package com.jinx.projos;

import java.util.List;

public class PageBean {

    public PageBean(){

    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getAllRecords() {
        return allRecords;
    }

    public void setAllRecords(Integer allRecords) {
        this.allRecords = allRecords;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public Integer getAllPages() {
        return allPages;
    }

    public void setAllPages(Integer allPages) {
        this.allPages = allPages;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<Shops> getShops() {
        return shops;
    }

    public void setShops(List<Shops> shops) {
        this.shops = shops;
    }

    public PageBean(int pageNum, int pageSize, int allRecords){
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.allRecords = allRecords;
        if (allRecords%pageSize == 0){
            this.allPages = allRecords/pageSize;
        }else
        {
            this.allPages = allRecords/pageSize+1;
        }
        this.startIndex = (pageNum-1)*pageSize;
        this.startPage = 1;
        this.endPage = 5;
        if (allPages<=5)
        {
            this.startPage =1;
            this.endPage = this.allPages;
        }else {
            this.startPage = this.pageNum - 2;
            this.endPage =this.pageNum +2;
            if(startPage <=0 )
            {
                this.startPage = 1;
                this.endPage = 5;
            }
            if(endPage > allPages)
            {
                this.startPage = endPage -4;
                this.endPage = this.allPages;
            }
        }

    }

    private Integer pageNum;

    private Integer pageSize;

    private Integer allRecords;

    private Integer startPage;

    private Integer endPage;

    private Integer allPages;

    private Integer startIndex;

    private List<Shops> shops;

    @Override
    public String toString() {
        return "PageBean{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", allRecords=" + allRecords +
                ", startPage=" + startPage +
                ", endPage=" + endPage +
                ", allPages=" + allPages +
                ", startIndex=" + startIndex +
                ", shops=" + shops +
                '}';
    }
}
