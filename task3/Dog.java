package oop.task3;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Метод для доступа к приватному полю breed
    public String getBreed() {
        return breed;
    }

    // Другие методы и свойства, специфичные для собаки
}
