package com.iosoft2020.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.iosoft2020.entity.Role;

public interface RoleMapper {

    @Select("select r.id id, r.name name, r.role_desc roleDesc from sys_role r, sys_user u where u.id = #{id} and r.id = u.id")
    public List<Role> findById(Integer uid);

    public List<Role> getAll();

    public Role getById(int id);

    public void save(Role role);

    public void update(Role role);

    public void delete(int id);

}