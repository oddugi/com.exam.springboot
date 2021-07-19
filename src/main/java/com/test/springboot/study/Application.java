package com.test.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    main() 함수 만들기
    @SpringBootApplication
    스프링부트의 시작설정, 자동설정
    프로젝트의 최상단에 위치
*/

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
