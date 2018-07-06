package com.tony.book_kepping.repository;

import com.tony.book_kepping.domain.Bill;
import com.tony.book_kepping.domain.BillType;
import com.tony.book_kepping.domain.Conditon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillTypeMapper {

    List<BillType> selectAll();


}
