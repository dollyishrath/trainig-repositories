package com.trimindtech.training.hw07;

public abstract class LivingThing {
    private String name;

    public LivingThing(String name) {
        this.name = name;
    }
    public void breath(){
        System.out.println("Living Thing breathing");
    }
    public void eat(){
        System.out.println("Living Thing eating");
    }
    public abstract void walk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
