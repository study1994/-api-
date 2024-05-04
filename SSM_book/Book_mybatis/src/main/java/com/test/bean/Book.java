package com.test.bean;

public class Book {
    private Integer bid;
    private String bname;
    private Integer btype;
    private Double price;
    private String bdesc;

    public Book(){}
    public Book(Integer bid, String bname, Integer btype, Double price, String bdesc) {
        this.bid = bid;
        this.bname = bname;
        this.btype = btype;
        this.price = price;
        this.bdesc = bdesc;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getBtype() {
        return btype;
    }

    public void setBtype(Integer btype) {
        this.btype = btype;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBdesc() {
        return bdesc;
    }

    public void setBdesc(String bdesc) {
        this.bdesc = bdesc;
    }
}
