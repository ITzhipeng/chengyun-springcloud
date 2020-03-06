package com.chengyun.chengyuneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
@EnableEurekaServer
public class ChengyuneurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengyuneurekaApplication.class, args);
    }

}
