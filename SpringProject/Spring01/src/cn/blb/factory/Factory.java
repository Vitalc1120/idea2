package cn.blb.factory;

import cn.blb.bean.Person;

public class Factory {

    public Person factory() {
        System.out.println("实例工厂...");
        return new Person();
    }

}
