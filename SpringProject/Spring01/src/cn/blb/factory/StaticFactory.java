package cn.blb.factory;

import cn.blb.bean.Person;

public class StaticFactory {

    public static Person staticFactory() {
        System.out.println("静态工厂...");
        return new Person();
    }

}
