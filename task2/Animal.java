package oop.task2;

public class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal(String param, int age, String sound) {
        name = param;
        this.age = age;
        this.sound = sound;
    }

    public Animal() {
        
    }

    public void makeSound() {
        System.out.println(name + " производит звук: " + sound);
    }

    public void eat() {
        System.out.println(name + " ест.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSound() {
        return sound;
    }
}
