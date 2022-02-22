package com.study.dao;

import com.study.vo.TestInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestInfoDao {
    public void insertTestInfo(TestInfoVo vo);
    public List<TestInfoVo> searchTestInfo();
}
