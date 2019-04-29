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
		Actor actor = (Actor) context.getBean("actor");
//		((AbstractApplicationContext) context).close();
		System.out.println(actor.toString());
		//for singleton scope
		Movie movie = (Movie) context.getBean("movie");
		movie.check();
		Movie movie1 = (Movie) context.getBean("movie");
		System.out.println(movie==movie1);
		//for prototype scope
		Movie movie2 = (Movie) context.getBean("movieP");
		Movie movie3 = (Movie) context.getBean("movieP");
		System.out.println(movie2==movie3);
	}
}

