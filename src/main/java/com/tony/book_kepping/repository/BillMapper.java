package com.tony.book_kepping.repository;

import com.tony.book_kepping.domain.Bill;
import com.tony.book_kepping.domain.Conditon;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface BillMapper {
    List<Bill> selectAll(Conditon conditon);
    int save(Bill bill);


}
