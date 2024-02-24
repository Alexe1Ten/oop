package oop.task4;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }
}