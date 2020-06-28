package com.learn.dubbo.impl;

import org.apache.dubbo.common.URL;

import com.learn.dubbo.api.CarInterface;

public class DazCar implements CarInterface {

    private CarInterface carInterface;

    // 注入点
    public void setRed(CarInterface carInterface){
        this.carInterface = carInterface;
    }


    @Override
    public void getColor(URL url) {
        System.out.println("依赖注入");
        carInterface.getColor(url);
    }
}
