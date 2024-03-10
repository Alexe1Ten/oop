package task5;

// Класс для представления собак
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Переопределение метода makeSound для собак
    @Override
    public String makeSound() {
        return "гав-гав";
    }
}
