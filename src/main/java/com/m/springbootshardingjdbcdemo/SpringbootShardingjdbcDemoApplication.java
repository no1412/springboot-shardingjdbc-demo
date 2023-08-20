package com.m.springbootshardingjdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ll
 */
@SpringBootApplication
public class SpringbootShardingjdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingjdbcDemoApplication.class, args);
    }

}
