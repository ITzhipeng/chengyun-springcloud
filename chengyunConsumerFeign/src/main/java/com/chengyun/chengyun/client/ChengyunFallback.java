package com.chengyun.chengyun.client;

import com.chengyun.chengyun.vo.ResultVo;
import org.springframework.stereotype.Component;


@Component
public class ChengyunFallback implements ChengyunFeignClient{


    @Override
    public String getVehicle() {
        return "服务调用失败";
    }
}

