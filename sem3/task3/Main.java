package sem3.task3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        MyList list = new MyList(numbers);
        
        // Используем цикл for-each для перебора элементов списка
        for (int num : list) {
            System.out.println(num);
        }

        
    }
}
