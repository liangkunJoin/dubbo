package com.learn.dubbo;

import java.util.Iterator;
import java.util.ServiceLoader;

import org.apache.dubbo.common.URL;

import com.learn.dubbo.api.CarInterface;

public class JavaSPITestMain {

    public static void main(String[] args) {
        // 加载类接口实现类
        ServiceLoader<CarInterface> load = ServiceLoader.load(CarInterface.class);
        final Iterator<CarInterface> iterator = load.iterator();
        while (iterator.hasNext()){
            // 没有用RUL
            URL url = new URL(null, null,0);
            iterator.next().getColor(url);
        }
    }
}
