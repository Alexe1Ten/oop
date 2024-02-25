package task5;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Бобик", 3);
        Animal cat = new Cat("Мурзик", 5);

        System.out.println(dog.getName() + " говорит: " + dog.makeSound());
        System.out.println(cat.getName() + " говорит: " + cat.makeSound());

        dog.eat(); // Обычный метод
        cat.eat(); // Обычный метод
    }
}
