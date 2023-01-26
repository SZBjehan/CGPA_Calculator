package com.example.cgpacalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CgpAcalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgpAcalculatorApplication.class, args);
    }

}
