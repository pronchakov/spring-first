package edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;

public class Main {

//    private static final Logger

    public static void main(String[] args) throws InterruptedException {
//        final var context = new ClassPathXmlApplicationContext("application-context.xml");
//
//        Thread.sleep(3000);
//        System.out.println(new Date());
//        Thread.sleep(2000);
//
//        final var now = context.getBean("now", Date.class);
//        System.out.println(now);

//        final var dao = context.getBean("dao", Dao.class);
//        System.out.println(dao);
//        var ui = context.getBean("ui", UI.class);
//        System.out.println(ui);
//
//        var ui2 = context.getBean("ui", UI.class);
//        System.out.println(ui2);

        final var context = new AnnotationConfigApplicationContext("edu.spring");
        System.out.println("Context created");
        Thread.sleep(2000);

//        var ui = context.getBean(UI.class);
//        System.out.println(ui);
//
//        var ui2 = context.getBean(UI.class);
//        System.out.println(ui2);

        var now = context.getBean("now", Date.class);
        System.out.println(now);
//
//        Thread.sleep(1000);
//
//        now = context.getBean("now", Date.class);
//        System.out.println(now);


    }
}
