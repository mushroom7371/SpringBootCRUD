package com.study.service;

import com.study.dao.TestInfoDao;
import com.study.vo.TestInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestInfoService{

    @Autowired
    TestInfoDao testInfoDao;

    public void insertTestInfo(TestInfoVo vo){
        testInfoDao.insertTestInfo(vo);
    }

    public List<TestInfoVo> searchTestInfo(){
        return testInfoDao.searchTestInfo();
    }

}
