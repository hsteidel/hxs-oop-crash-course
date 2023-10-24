package com.ct;


public class Main {
    //OOP

    /**
     *  - Intro to Lombok
     *  - Inheritance
     *  - Interfaces
     *
     *   -> POJO (plain ole java object) / DTO (data transfer object)
     */
    public static void main(String[] args) {
        var fish = new Goldfish();
        fish.setName("joe");
        fish.setColor("red");
        System.out.println(fish);

        final var petGame = new PetGame();
        petGame.printPetName(fish);

        var dog = new Dog();
        dog.setName("Max");
        //This doesn't work for now petGame.printPetName(dog);

        var dogAsPet = Pet.builder()
                .type("dog")
                .name("Max")
                .build();

        petGame.printPetName(dogAsPet);

        petGame.sayHello(fish);

        //this is an example of a Greetable that is not valid for whatever reason
        //petGame.sayHello(new Alien());

        var snapper = new Snapper();
        snapper.setColor("red");
        snapper.setName("zz");
        //this say hello is different than Goldfish's sayHello()
        snapper.sayHello();


        petGame.printType(snapper);

    }
}