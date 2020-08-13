package com.iosoft2020.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Employee {

    private String id;
    private String name;
    private String email;
    private String gender;
    private Department department;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birth;

}
