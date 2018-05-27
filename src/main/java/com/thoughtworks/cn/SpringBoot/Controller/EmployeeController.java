package com.thoughtworks.cn.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

    @GetMapping(value = "/employees")
    public String getEmployee() throws Exception {
        return "hello";
    }
}
