package com.learn.dubbo.impl;

import org.apache.dubbo.common.URL;

import com.learn.dubbo.api.CarInterface;

public class RedCar implements CarInterface {


    @Override
    public void getColor(URL url) {
        System.out.println("car is Red!");
    }
}
