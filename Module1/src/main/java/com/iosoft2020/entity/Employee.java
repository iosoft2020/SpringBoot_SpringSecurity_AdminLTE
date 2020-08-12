package com.iosoft2020.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Employee {

    private String id;
    private String name;
    private String email;
    private String gender;
    private String deparment;
    private LocalDateTime birth;

}
