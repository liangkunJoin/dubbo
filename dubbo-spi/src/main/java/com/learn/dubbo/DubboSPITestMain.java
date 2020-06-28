package com.learn.dubbo;

import java.util.HashMap;
import java.util.Map;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import com.learn.dubbo.api.CarInterface;

public class DubboSPITestMain {

    public static void main(String[] args) {
        ExtensionLoader<CarInterface> extensionLoader = ExtensionLoader.getExtensionLoader(CarInterface.class);


        //自动注入
        CarInterface car = extensionLoader.getExtension("red");
        // 没有用RUL
        URL url = new URL(null, null,0);
        car.getColor(url);


        // AOP
        Map<String, String> map = new HashMap<>();
        map.put("car", "red");
        URL AopUrl = new URL(null, null,0, map);
        CarInterface dazCar = extensionLoader.getExtension("daz");
        dazCar.getColor(AopUrl);

    }
}
