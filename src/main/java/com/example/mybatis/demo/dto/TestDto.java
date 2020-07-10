package com.example.mybatis.demo.dto;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestDto {
    private int id;
    private String name;
    private int age;
    private String addr;
}
