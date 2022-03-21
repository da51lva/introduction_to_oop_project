package com.techreturners.introduction_to_oop_project;

public class ConsoleApplication {

    public static void main(String[] args){

        Bird myBird = new Bird("Tweety", "Yellow");
        myBird.speak();
        myBird.fly();

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
    }
}
