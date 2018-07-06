package com.tony.book_kepping.service;

import com.tony.book_kepping.domain.Bill;
import com.tony.book_kepping.domain.Conditon;


import java.util.List;


public interface BillService {

    List<Bill> selectAll();
    List<Bill> selectByCondition(Conditon conditon);
    boolean add(Bill bill);
}
