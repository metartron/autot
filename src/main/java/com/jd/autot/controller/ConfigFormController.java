package com.jd.autot.controller;

import com.jd.autot.common.Result;
import com.jd.autot.domain.ConfigForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConfigFormController {

    @PostMapping("/configForm")
    public Result addConfigForm(ConfigForm configForm) {

        return null;
    }

    @DeleteMapping("/configForm/{id}")
    public Result delConfigForm(@PathVariable("id") Integer id) {

        return null;
    }

    @PutMapping("/configForm")
    public Result updateConfigForm(ConfigForm configForm) {

        return null;
    }

    @GetMapping("/configForm/{}")
    public Result updateConfigForm(Integer id) {

        return null;
    }
}
