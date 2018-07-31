package com.jd.autot.init;

import com.jd.autot.service.ConfigFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class AutowiredBeanFormDB {

    @Autowired
    private ConfigFormService configFormService;

    @PostConstruct
    public void initBeanFormDB() {

    }
}
