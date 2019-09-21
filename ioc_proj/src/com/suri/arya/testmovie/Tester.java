package com.suri.arya.testmovie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suri.arya.beans.MovieBeans;

public class Tester {

	public static void main(String[] arg)
	{
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		MovieBeans beans = applicationContext.getBean(MovieBeans.class);
		System.out.println(beans.getName());
		System.out.println(beans.getLanguage());
		System.out.println(beans.getTime());
		System.out.println(beans.getActorBeans());  
		
	}
	
}
