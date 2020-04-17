package cn.blb.test;

import cn.blb.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    /**
     * 实例工厂
     */
    private static void method3() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = app.getBean("byFactory", Person.class);
        System.out.println(p);
    }

    /**
     * 静态工厂
     */
    private static void method2() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = app.getBean("byStaticFactory", Person.class);
        System.out.println(p);
    }

    /**
     * 调用无参
     */
    private static void method1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = app.getBean("getPerson", Person.class);
        System.out.println(p);
    }

}
