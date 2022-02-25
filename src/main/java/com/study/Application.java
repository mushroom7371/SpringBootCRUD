package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//프로젝트 메인 클래스
//스프링 부트의 자동 설정, 스프링 Bean읽기와 생성 모두 자동으로 설정된다.
//@SpringBootApplication 이 있는 위치부터 설정을 읽어나가기 때문에 이 클래스는 항상 프로젝트의 최 상단에 위치 해야됨
@SpringBootApplication
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class, args); //스프링부트는 내장 WAS를 사용한다 때문에 환경이 달라질 확률이 낮다
    }
}
