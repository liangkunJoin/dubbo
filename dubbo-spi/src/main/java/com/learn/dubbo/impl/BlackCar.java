package com.learn.dubbo.impl;

import org.apache.dubbo.common.URL;

import com.learn.dubbo.api.CarInterface;

public class BlackCar implements CarInterface {


    @Override
    public void getColor(URL url) {
        System.out.println("Car is Black!");
    }
}
