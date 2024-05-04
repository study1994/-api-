package com.yyzy.bean.factory;

import com.yyzy.bean.po.Cat;

public class CatFactory {
    // 使用自己的工厂创建 Cat 实例
    public static Cat getStaticCat() {
        Cat cat = new Cat();
        return cat;
    }
}
