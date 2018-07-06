package com.tony.book_kepping;

import com.tony.book_kepping.repository.BillMapper;
import com.tony.book_kepping.repository.BillTypeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookKeppingApplicationTests {

    @Autowired
    private BillMapper billMapper;
    @Autowired
    private BillTypeMapper  billTypeMapper;

    @Test
    public void contextLoads() {
    }

}
