package task5;

// Класс для представления кошек
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Переопределение метода makeSound для кошек
    @Override
    public String makeSound() {
        return "мяу-мяу";
    }
}
