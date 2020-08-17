package com.iosoft2020.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.iosoft2020.entity.SysRole;

public interface RoleMapper {

    @Select("select r.rid rid, r.role_name roleName, r.role_desc roleDesc from sys_role r, sys_user u where u.uid = #{uid} and r.rid = u.rid")
    public List<SysRole> findByUid(Integer uid);
}