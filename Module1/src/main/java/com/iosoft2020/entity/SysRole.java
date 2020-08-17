package com.iosoft2020.entity;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
public class SysRole implements GrantedAuthority{

    private Integer rid;
    private String roleName;
    private String roleDesc;
    @Override
    public String getAuthority() {
        return roleName;
    }
}
