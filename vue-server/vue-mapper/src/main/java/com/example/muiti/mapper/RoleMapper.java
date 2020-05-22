package com.example.muiti.mapper;

import com.example.muiti.model.Menu;
import com.example.muiti.model.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    @Select("select * from role order by id")
    List<Role> getAllRoles();

    List<Menu> getAllMenus();
}