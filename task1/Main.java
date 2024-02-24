package oop.task1;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal("Животное", 6, "Рычит");
        Animal animal = new Animal();
        animal.name = "Животное";
        animal.age = 6;
        animal.sound = "рычит";

        animal.eat();
    }
    

}
