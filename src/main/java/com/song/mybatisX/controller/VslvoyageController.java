package com.song.mybatisX.controller;

import com.song.mybatisX.service.impl.VslvoyageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class VslvoyageController {

    @Autowired
    private VslvoyageServiceImpl vslvoyageService;

    @RequestMapping(value = "/show",produces = "application/json;charset=UTF-8")
    public void show(){
        System.out.println("hello");
    }
}
