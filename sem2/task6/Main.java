package task6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.defaultMethod();
        Soundable.staticMethod();
        // Доступ к константе из интерфейса Eatable
        System.out.println("Тип пищи: " + Soundable.SOUND_TYPE);
    }
}