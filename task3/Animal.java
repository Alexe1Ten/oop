package oop.task3;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Методы для доступа к приватным полям
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Общие методы для всех животных
    public void makeSound() {
        // Реализация звука животного
    }

    public void eat() {
        // Реализация питания животного
    }
}