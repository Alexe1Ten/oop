package oop.task3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Лабрадор");
        Cat cat = new Cat("Мурка", 5, true);

        // Доступ к методам и свойствам через открытые методы
        System.out.println(dog.getName() + " возраст: " + dog.getAge() + ", порода: " + dog.getBreed());
        System.out.println(cat.getName() + " возраст: " + cat.getAge() + ", домашняя: " + cat.isIndoor());
    }
}
