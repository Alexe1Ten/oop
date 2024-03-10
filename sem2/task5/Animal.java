package task5;

// Абстрактный класс Animal
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод, предоставляющий голос животного
    public abstract String makeSound();

    // Обычный метод, который можно использовать без переопределения
    public void eat() {
        System.out.println(name + " ест.");
    }

    // Геттеры и сеттеры для свойств name и age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}