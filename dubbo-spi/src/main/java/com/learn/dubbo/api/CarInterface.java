package com.learn.dubbo.api;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface CarInterface {

    // AOP 需要加入一个注解获取对应的实现，代理
    @Adaptive("car")
    void getColor(URL url);

}
