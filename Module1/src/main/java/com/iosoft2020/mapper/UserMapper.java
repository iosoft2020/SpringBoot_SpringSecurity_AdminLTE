package com.iosoft2020.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.iosoft2020.entity.SysUser;

public interface UserMapper {

    @Select("select * from sys_user where username = #{username}")
    @Results({
            @Result(id = true, property = "uid", column = "uid"),
            @Result(property = "roles", column = "uid", javaType = List.class, many = @Many(select = "com.iosoft2020.mapper.RoleMapper.findByUid"))
    })
    public SysUser findByName(String username);
}