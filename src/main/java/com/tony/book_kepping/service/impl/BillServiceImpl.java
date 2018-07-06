package com.tony.book_kepping.service.impl;

import com.tony.book_kepping.domain.Bill;
import com.tony.book_kepping.domain.Conditon;
import com.tony.book_kepping.repository.BillMapper;
import com.tony.book_kepping.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public List<Bill> selectAll() {
        return billMapper.selectAll(new Conditon());
    }

    @Override
    public List<Bill> selectByCondition(Conditon conditon) {
        return billMapper.selectAll(conditon);
    }

    @Override
    public boolean add(Bill bill) {
        return (billMapper.save(bill) == 0) ? false : true;
    }


}
