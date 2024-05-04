package com.yyzy.bean.factory;

import com.yyzy.bean.po.Cat3;

public class Cat3Factory {
    public Cat3Factory() {
        System.out.println("Cat工厂实例化中");
    }

    // 创建 Cat3 实例的方法
    public Cat3 createBean() {
        return new Cat3();
    }
}
