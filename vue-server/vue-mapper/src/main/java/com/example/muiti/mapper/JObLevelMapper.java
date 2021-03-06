package com.example.muiti.mapper;

import com.example.muiti.model.JObLevel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JObLevelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(JObLevel record);

    int insertSelective(JObLevel record);

    JObLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JObLevel record);

    int updateByPrimaryKey(JObLevel record);

    @Select("select * from joblevel")
    List<JObLevel> selectAllJObLevel();

    Integer deleteByIds(Integer[] ids);
}