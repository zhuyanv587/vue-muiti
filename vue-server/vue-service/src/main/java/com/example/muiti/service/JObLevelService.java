package com.example.muiti.service;

import com.example.muiti.mapper.JObLevelMapper;
import com.example.muiti.model.JObLevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class JObLevelService {
    @Resource
    JObLevelMapper jobLevelMapper;

    public List<JObLevel> getAllJObLevel() {
        return jobLevelMapper.selectAllJObLevel();
    }

    public Integer addJObLevel(JObLevel jobLevel) {
        jobLevel.setEnabled(true);
        jobLevel.setCreateDate(new Date());
        return jobLevelMapper.insertSelective(jobLevel);
    }

    public Integer updateJObLevel(JObLevel jObLevel) {
        return jobLevelMapper.updateByPrimaryKeySelective(jObLevel);
    }

    public Integer deleteJObLevel(Integer id) {
        return jobLevelMapper.deleteByPrimaryKey(id);
    }
    public Integer deleteJObLevel(Integer[] ids) {
        return jobLevelMapper.deleteByIds(ids);
    }
}
