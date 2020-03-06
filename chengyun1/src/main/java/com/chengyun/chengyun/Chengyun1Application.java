package com.chengyun.chengyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

@RefreshScope   //开启配置更新功能
public class Chengyun1Application {

    public static void main(String[] args) {
        SpringApplication.run(Chengyun1Application.class, args);
    }

}
