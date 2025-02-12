package org.example.oops.access.Strings;

public class Testing {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.age=2;
        animal.color="red";
        Dog dog=new Dog();
        dog.breed="street dog";

        System.out.println(animal.age);
        System.out.println(dog.breed);

    }

}
