package com.stackroute.domain;
public class movie  {
     private actor actor;
    public movie(com.stackroute.domain.actor actor) {
        this.actor = actor;
    }

    public com.stackroute.domain.actor getActor() {
        return actor;
    }
    public void setActor(com.stackroute.domain.actor actor) {
        this.actor = actor;
    }

    public void displayDetails() {
        actor.displayDetails();
    }
}


