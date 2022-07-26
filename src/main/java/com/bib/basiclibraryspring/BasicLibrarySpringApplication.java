package com.bib.basiclibraryspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bib.basiclibraryspring")
@MapperScan("com.bib.basiclibraryspring.mapper")
public class BasicLibrarySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicLibrarySpringApplication.class, args);
    }

}
