package com.study.gradletest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception{
        return "Jsp in Gradle";
    }

    @RequestMapping("/test")
    public String test1(){
        return "test";
    }

    @RequestMapping(value = "insertGo", method = RequestMethod.GET)
    public ModelAndView insertGo(ModelAndView mav){
        mav.setViewName("insertGo");

        return mav;
    }
}
