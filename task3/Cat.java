package oop.task3;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    // Метод для доступа к приватному полю isIndoor
    public boolean isIndoor() {
        return isIndoor;
    }

    // Другие методы и свойства, специфичные для кошки
}
