package com.song.mybatisX.mapper;

import com.song.mybatisX.pojo.Vslvoyage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestVslvoyageMapper {
    @Autowired
    private VslvoyageMapper vslvoyageMapper;

    @Test
    public void test1(){
        Vslvoyage vslvoyage = vslvoyageMapper.selectById("000000001267E");
        System.out.println(vslvoyage);
    }
}
