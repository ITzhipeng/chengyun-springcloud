package com.chengyun.chengyunconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ChengyunconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengyunconfigApplication.class, args);
    }

}
