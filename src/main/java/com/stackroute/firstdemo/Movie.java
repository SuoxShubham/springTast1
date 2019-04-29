package com.stackroute.firstdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
 Actor actor;


//public void setActor(Actor actor) {
//	this.actor = actor;
//}



public void check() {
	System.out.println(actor.toString());
}

public Movie(Actor actor) {
	super();
	this.actor = actor;
}

@Override
public void setBeanName(String name) {
	// TODO Auto-generated method stub
	System.out.println("the bean name is "+name);
	
}

@Override
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("the beanfatory is "+beanFactory);
	
}

@Override
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("the application context is "+applicationContext);
	
}
}
