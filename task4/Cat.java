package oop.task4;

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяучит");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }
}
