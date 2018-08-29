package com.stn.serverfeign.controller;

import com.stn.serverfeign.service.FeignServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @SuppressWarnings("all")
    @Autowired
    FeignServiceHi feignServiceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name){
        return feignServiceHi.sayHiFromClient(name);
    }
}
