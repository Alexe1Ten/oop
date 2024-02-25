package task4;

public class Main {
    public static void main(String[] args) {
        // Создаем массив животных разных типов
        Animal[] animals = {new Dog(), new Cat()};

        // Используем полиморфизм для вызова методов makeSound и eat
        for (Animal an : animals) {
            an.makeSound(); // Вызываем метод makeSound для каждого объекта
            an.eat();       // Вызываем метод eat для каждого объекта
            System.out.println(); // Для отделения вывода информации о разных животных
        }
    }
}
