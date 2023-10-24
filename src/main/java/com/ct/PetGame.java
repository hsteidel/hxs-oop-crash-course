package com.ct;

public class PetGame {


/*    public void printPetName(Goldfish goldfish) {
        System.out.println("Your pet name is " + goldfish.getName());
    }*/

    public void printPetName(Pet pet) {
        System.out.println("Your pet name is " + pet.getName());
    }

    public void sayHello(Dog dog) {
        dog.sayHello();
    }

    public void printPetName(HousePet housePet) {
        System.out.println("Your pet name is " + housePet.getName());
    }

    public void sayHello(Goldfish goldfish) {
        System.out.println("Pet Game:::");
        goldfish.sayHello();
    }
    public void sayHello(Pet pet) {
         pet.sayHello();
    }

    public void sayHello(Greetable pet) {
        pet.sayHello();
    }

    public void printType(HousePet pet) {
        System.out.println(pet);
    }

    //using instanceof to check the type and do something above the normal sayHello();
    public void sayHelloByType(Greetable greetable) {
        if (greetable instanceof Goldfish goldfish) {
            System.out.println("You've got a fish");
            goldfish.sayHello();
        }
        if (greetable instanceof Dog dog) {
            System.out.println("You've got a dog");
            dog.sayHello();
        }

    }
}
