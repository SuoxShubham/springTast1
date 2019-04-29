package com.stackroute.firstdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
//
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("this is destroy method");
//		
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("this is intializingbean method");
//	}

public class BeanLifecycleDemoBean{
  public void customInit() {
	  System.out.println("this is init method");
  }
  
  public void customDestroy() {
	  System.out.println("this is destroy method");
  }
}
 