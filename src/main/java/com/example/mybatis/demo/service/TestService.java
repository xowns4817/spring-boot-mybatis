package com.example.mybatis.demo.service;

import com.example.mybatis.demo.dto.TestDto;
import com.example.mybatis.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.tags.form.TextareaTag;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<TestDto> selectService( ) {
        return testRepository.selectRepo();
    }

    public void insertService(TestDto testDto) {
        testRepository.insertRepo(testDto);
    }
}
