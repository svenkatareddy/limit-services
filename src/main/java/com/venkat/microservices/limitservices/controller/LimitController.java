package com.venkat.microservices.limitservices.controller;

import com.venkat.microservices.limitservices.config.LimitsConfig;
import com.venkat.microservices.limitservices.service.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    LimitsConfig limitsConfig;

    @GetMapping("/limit")
    public Limits getLimitsServices(){

        return new Limits(limitsConfig.getMinimum(),limitsConfig.getMaximum());
    }

}
