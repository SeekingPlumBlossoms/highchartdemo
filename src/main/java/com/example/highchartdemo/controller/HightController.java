package com.example.highchartdemo.controller;

import com.example.highchartdemo.dao.QueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HightController {
    @Autowired
    private QueryDao queryDao;

    @RequestMapping("/index")
    public String goIndex(){
        System.out.println("进入首页:"+queryDao.queryData());
        return "index";
    }

}
