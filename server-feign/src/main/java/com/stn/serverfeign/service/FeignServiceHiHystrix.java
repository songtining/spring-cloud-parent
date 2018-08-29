package com.stn.serverfeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHiHystrix implements FeignServiceHi {
    @Override
    public String sayHiFromClient(String name) {
        return "hi," + name + ",sorry,error!-ribbon";
    }
}
