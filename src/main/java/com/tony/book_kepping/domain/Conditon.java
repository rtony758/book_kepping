package com.tony.book_kepping.domain;

import java.util.Date;

public class Conditon {

    private BillType billType;
    private Date fromBillTime;
    private Date toBillTime;

    public Conditon() {
    }

    public Conditon(BillType billType, Date fromBillTime, Date toBillTime) {
        this.billType = billType;
        this.fromBillTime = fromBillTime;
        this.toBillTime = toBillTime;
    }

    public Conditon(BillType billType) {
        this.billType = billType;
    }

    public Conditon(Date fromBillTime, Date toBillTime) {
        this.fromBillTime = fromBillTime;
        this.toBillTime = toBillTime;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public Date getFromBillTime() {
        return fromBillTime;
    }

    public void setFromBillTime(Date fromBillTime) {
        this.fromBillTime = fromBillTime;
    }

    public Date getToBillTime() {
        return toBillTime;
    }

    public void setToBillTime(Date toBillTime) {
        this.toBillTime = toBillTime;
    }
}
