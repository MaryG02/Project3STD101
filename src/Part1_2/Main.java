package Part1_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cow());
        list.add(new Pig());


        for (Animal animal: list){
            animal.makeSound();
        }

    }
}
abstract class Animal{
    abstract void makeSound();

}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow");

    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Woof");

    }
}
class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("Moo");

    }
}
class Pig extends Animal{
    @Override
    void makeSound(){
        System.out.println("Oink");

    }
}