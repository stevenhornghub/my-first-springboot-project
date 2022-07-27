package com.bib.basiclibraryspring;

import ch.vorburger.exec.ManagedProcessException;
import com.bib.basiclibraryspring.db.LibraryDatabase;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bib.basiclibraryspring")
@MapperScan("com.bib.basiclibraryspring.mapper")
public class BasicLibrarySpringApplication {
    public static void main(String[] args) throws ManagedProcessException {
        //WRITE SOME CODES TO START YOUR DB
        //Configure your DB to use schema.sql
        LibraryDatabase.init();
        SpringApplication.run(BasicLibrarySpringApplication.class, args);
    }
}
