package com.stackroute.firstdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Hi Main method is up ");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Movie movie =(Movie)context.getBean("movie");
//		movie.check();
		Movie movieP =(Movie)context.getBean("movieP");
		movieP.check();
	}
}

