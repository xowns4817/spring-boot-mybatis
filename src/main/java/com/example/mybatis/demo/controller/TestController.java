package com.example.mybatis.demo.controller;

import com.example.mybatis.demo.dto.TestDto;
import com.example.mybatis.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public List<TestDto> select_test( ) {
        return testService.selectService();
    };

    @PostMapping("/test")
    public void insert_test(@RequestBody TestDto testDto) {
        testService.insertService(testDto);
    }

}
