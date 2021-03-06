package com.swg.eurekaclientfeign.controller;

import com.swg.eurekaclientfeign.service.CityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 【swg】.
 * @Date 2018/11/23 14:48
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@RestController
public class TestController {
    @Autowired
    private CityClient cityClient;
    @GetMapping("cities")
    public String getData(){
        String res = cityClient.listCity();
        return res;
    }
}
