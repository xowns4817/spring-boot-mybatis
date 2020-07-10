package com.example.mybatis.demo.repository;

import com.example.mybatis.demo.dto.TestDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
@Repository
public interface TestRepository {

    @Select("SELECT * from test_table")
    List<TestDto> selectRepo( );

    @Insert("INSERT INTO test_table (name, age, addr) values(#{name}, #{age}, #{addr})")
    void insertRepo(TestDto dto);

    //@Update("UPDATE test_table set name=#{name} age=#{age}")
}
