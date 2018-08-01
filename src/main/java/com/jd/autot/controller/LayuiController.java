package com.jd.autot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayuiController {

    @GetMapping(value = {"/","/index"})
    public String index() {
        return "layui/layui";
    }
}
