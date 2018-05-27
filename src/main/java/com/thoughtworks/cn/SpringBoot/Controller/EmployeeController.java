package com.thoughtworks.cn.SpringBoot.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

    @GetMapping(value = "/employees")
    public String getEmployee() throws Exception {
        return "hello";
    }
}
