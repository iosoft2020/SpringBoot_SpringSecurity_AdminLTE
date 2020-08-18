package com.iosoft2020.entity;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
public class Role implements GrantedAuthority{

    private Integer id;
    private String name;
    private String roleDesc;
    @Override
    public String getAuthority() {
        return name;
    }
}
