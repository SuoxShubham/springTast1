package com.stackroute.firstdemo;
public class Movie {
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
}
