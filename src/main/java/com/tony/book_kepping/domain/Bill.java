package com.tony.book_kepping.domain;

import java.util.Date;

public class Bill {
    private Integer id;
    private String title;
    private Date billTime;
    private BillType billType;
    private Double price;
    private String explan;

    public Bill() {
    }

    public Bill(String title, Date billTime, BillType billType, Double price, String explan) {
        this.title = title;
        this.billTime = billTime;
        this.billType = billType;
        this.price = price;
        this.explan = explan;
    }

    public Bill(Integer id, String title, Date billTime, BillType billType, Double price, String explan) {
        this.id = id;
        this.title = title;
        this.billTime = billTime;
        this.billType = billType;
        this.price = price;
        this.explan = explan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getExplan() {
        return explan;
    }

    public void setExplan(String explan) {
        this.explan = explan;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", billTime=" + billTime +
                ", billType=" + billType +
                ", price=" + price +
                ", explan='" + explan + '\'' +
                '}';
    }
}
