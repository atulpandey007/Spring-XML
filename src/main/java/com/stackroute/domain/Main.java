package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor = context.getBean(Actor.class);
        movie movie = context.getBean(movie.class);
        movie.displayDetails(actor);






    }
}
