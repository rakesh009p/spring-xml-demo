package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public  static  void main(String[] args) {

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("bean.xml"));
        Movie movie=xmlBeanFactory.getBean("movie1",Movie.class);
        Movie movie1=xmlBeanFactory.getBean("movie2",Movie.class);
        System.out.println(movie.toString());
        System.out.println(movie1.toString());

    }
}