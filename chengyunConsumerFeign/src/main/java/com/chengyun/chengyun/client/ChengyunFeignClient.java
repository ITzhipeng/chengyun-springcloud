package com.chengyun.chengyun.client;

import com.alibaba.fastjson.JSON;
import com.chengyun.chengyun.domain.WhclJbxx;
import com.chengyun.chengyun.vo.ResultVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
    @FeignClient(value = "chengyun", fallback=ChengyunFallback.class) //这里的value对应调用服务的spring.applicatoin.name
    public interface ChengyunFeignClient {

        @PostMapping(value = "/vehicle/basicinfo")
        public String getVehicle();
    }

