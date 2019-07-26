package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Actor actor = applicationContext.getBean("actor", Actor.class);
        Movie movie = applicationContext.getBean("movie", Movie.class);
        System.out.println(actor.getAge());
        System.out.println(movie.toString());




    }
}