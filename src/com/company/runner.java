package com.company;

public class runner {

    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        Dog dog = new Dog("dog");
        LoudDog loudDog = new LoudDog("loud dog");

        System.out.println(cat.speak());
        System.out.println(dog.speak());
        System.out.println(loudDog.speak());
        new Kennel(cat, dog, loudDog).allSpeak();
    }
}
