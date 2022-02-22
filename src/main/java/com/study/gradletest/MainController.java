package com.study.gradletest;

import com.study.dao.TestInfoDao;
import com.study.vo.TestInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

    @Autowired
    TestInfoDao dao;

    @RequestMapping("/")
    public String root() throws Exception{
        return "test";
    }

    @RequestMapping(value = "insertGo", method = RequestMethod.GET)
    public ModelAndView insertGo(ModelAndView mav){
        mav.setViewName("insertGo");
        return mav;
    }

    @RequestMapping(value = "searchGo", method = RequestMethod.GET)
    public ModelAndView searchGo(ModelAndView mav){
        mav.setViewName("searchGo");
        return mav;
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public ModelAndView insert(ModelAndView mav, TestInfoVo vo, HttpServletRequest req, HttpServletResponse res){


        return mav;
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public ModelAndView search(ModelAndView mav){

        mav.addObject("veiwAll", dao.searchTestInfo());
        mav.setViewName("searchGo");

        return mav;
    }


}
