package com.tony.book_kepping.domain;

public class BillType {
    private Integer id;
    private String name;


    public BillType() {
    }

    public BillType(String name) {
        this.name = name;
    }

    public BillType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BillType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
