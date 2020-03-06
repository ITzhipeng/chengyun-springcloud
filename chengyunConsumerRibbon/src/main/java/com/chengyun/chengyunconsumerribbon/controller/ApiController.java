package com.chengyun.chengyunconsumerribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;

@CrossOrigin
@RestController
public class ApiController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 危化车辆基本信息接口
     * @return
     * @throws SQLException
     */
    @Value("${server.port}")
    String port;
    // 调用：localhost:6007/consumerServiceRibbon?token=1
    @PostMapping("/consumerServiceRibbon")
    @HystrixCommand(fallbackMethod="consumerServiceRibbonFallback")
    public String consumerServiceRibbon(){
        String result = this.restTemplate.postForObject("http://chengyun/vehicle/basicinfo","",String.class);
        return result;
    }

    public String consumerServiceRibbonFallback(){
        return "consumerServiceRibbon异常，端口：" + port  + "，Name=" ;
    }


}
