package com.iosoft2020.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.iosoft2020.entity.User;

public interface UserMapper {

    @Select("select * from sys_user where username = #{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class, many = @Many(select = "com.iosoft2020.mapper.RoleMapper.findById"))
    })
    public User findByName(String username);

    public List<User> getAll();

    public User getById(int id);

    public void save(User sysUser);

    public void update(User sysUser);

    public void delete(int id);
}