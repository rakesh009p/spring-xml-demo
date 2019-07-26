package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Actor actor = applicationContext.getBean("actor", Actor.class);
        System.out.println(actor.toString());
        Actor actor1 = applicationContext.getBean("actor1", Actor.class);
        System.out.println(actor1.toString());
        Actor actor2 = applicationContext.getBean("actor2", Actor.class);
        System.out.println(actor2.toString());
        Movie movie = applicationContext.getBean("movie1", Movie.class);
        System.out.println(movie.toString());
        Movie movie1 =applicationContext.getBean("movie2",Movie.class);
        System.out.println(movie1.toString());
        System.out.println(movie1==movie);




    }
}