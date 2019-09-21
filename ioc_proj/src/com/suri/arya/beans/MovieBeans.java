package com.suri.arya.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieBeans implements Serializable {

	
	@Value("KGF-2")
	private String name;
	@Value("kannada")
	private String language;
	@Value("2.42")
	private double time;
	
	
	@Autowired
	private ActorBeans actorBeans;
	
	
	public MovieBeans(String name, String language, double time, ActorBeans actorBeans)
	{
	
		super();
		this.name = name;
		this.language = language;
		this.time = time;
		this.actorBeans = actorBeans;
		
	}
	
	
	
	
	
	public void entertain(){
		System.out.println("What an Entertinment...");
	}
	
	public MovieBeans() {
	
		System.out.println(this.getClass().getSimpleName()+"created");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public double getTime() {
		return time;
	}



	public void setTime(double time) {
		this.time = time;
	}

	public ActorBeans getActorBeans() {
		return actorBeans;
	}

	public void setActorBeans(ActorBeans actorBeans) {
		this.actorBeans = actorBeans;
	}
	
	
	
	
}
