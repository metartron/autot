package com.jd.autot.controller;

import com.jd.autot.common.Result;
import com.jd.autot.domain.TestCase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConfigFormController {


    @PostMapping("/configForm")
    public Result addConfigForm(TestCase testCase) {

        return null;
    }

    @DeleteMapping("/configForm/{id}")
    public Result delConfigForm(@PathVariable("id") Integer id) {

        return null;
    }

    @PutMapping("/configForm")
    public Result updateConfigForm(TestCase testCase) {

        return null;
    }

    @GetMapping("/configForm/{}")
    public Result updateConfigForm(Integer id) {

        return null;
    }
}
