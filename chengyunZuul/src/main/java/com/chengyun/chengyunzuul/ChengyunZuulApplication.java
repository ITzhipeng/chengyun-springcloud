package com.chengyun.chengyunzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
public class ChengyunZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengyunZuulApplication.class, args);
    }

}
