package oop.task1;

public class Animal {
    public String name;
    public int age;
    public String sound;


    public void makeSound() {
        System.out.println(name + " производит звук: " + sound);
    }

    public void eat() {
        System.out.println(name + " ест.");
    }

    // Другие методы и свойства, общие для всех животных
}
