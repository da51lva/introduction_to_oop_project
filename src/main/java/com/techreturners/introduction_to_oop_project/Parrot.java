package com.techreturners.introduction_to_oop_project;

public class Parrot extends Bird{

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println(this.name+" will say what you say!");
    }
}
