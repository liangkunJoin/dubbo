package com.learn.dubbo.wrapper;

import org.apache.dubbo.common.URL;

import com.learn.dubbo.api.CarInterface;

public class CarWrapper implements CarInterface {

    private CarInterface carInterface;

    public CarWrapper(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getColor(URL url) {

        System.out.println("方法执行前。。。。");
        carInterface.getColor(url);
        System.out.println("方法执行后。。。。");
    }
}
