package com.stackroute.demo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public void myMethod() {
        System.out.println("method started");
    }

    public void customInit() {
        System.out.println("After Bean Instantiation");
    }

    public void customDestroy() {
        System.out.println("Before Bean Destroying");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("applying set method for bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy method");
    }
}