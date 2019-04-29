package com.stackroute.firstdemo;
public class Movie {
 Actor actor;

public Movie(Actor actor) {
	this.actor = actor;
}

//public void setActor(Actor actor) {
//	this.actor = actor;
//	System.out.println("this movie method is on");
//}
public void check() {
//	actor.setAge(12);
//	actor.setName("AKFGO");
//	actor.setGender("Male");
	System.out.println(actor.toString());
}
}
