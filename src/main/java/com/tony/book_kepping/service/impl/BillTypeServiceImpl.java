package com.tony.book_kepping.service.impl;

import com.tony.book_kepping.domain.BillType;
import com.tony.book_kepping.repository.BillTypeMapper;
import com.tony.book_kepping.service.BillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillTypeServiceImpl implements BillTypeService {

    @Autowired
    private BillTypeMapper billTypeMapper;

    @Override
    public List<BillType> selectAll() {
        return billTypeMapper.selectAll() ;
    }
}
