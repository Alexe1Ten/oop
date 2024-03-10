package sem5.task1;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public double getOperand(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public char getOperator() {
        System.out.print("Введите оператор (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
