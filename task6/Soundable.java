package task6;

// Интерфейс для представления звуков, издаваемых животными
public interface Soundable {
    String makeSound();

    // Дефолтный метод
    default void defaultMethod() {
        System.out.println("Это дефолтный метод в интерфейсе Soundable.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Это статический метод в интерфейсе Soundable.");
    }

    // Константа
    String SOUND_TYPE = "Звук";
}
