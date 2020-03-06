package com.chengyun.chengyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

@EnableDiscoveryClient
@EnableFeignClients
//@RefreshScope   //开启配置更新功能
public class ChengyunConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengyunConsumerFeignApplication.class, args);
    }

}
