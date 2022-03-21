package com.techreturners.introduction_to_oop_project;

public class ConsoleApplication {

    public static void main(String[] args){

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot polly = new Parrot("Polly", "Red");
        polly.speak();
    }
}
