package projects.calculator;

import java.util.Scanner;

class Calculate {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of Numbers are ::" + sum);
    }

    public void subtract(int a, int b) {
        int subtract = a - b;
        System.out.println("Subtraction of Numbers are ::" + subtract);
    }

    public void multiply(int a, int b) {
        if(a == 0 || b == 0){
            System.out.println("Result will be Zero");
            return;
        }
        int multiply = a * b;
        System.out.println("Multiplication of Numbers are ::" + multiply);
    }

    public void divide(int a, int b) {
        if(a == 0 || b == 0){
            System.out.println("Result is Zero");
            return;
        }
        int divide = a / b;
        System.out.println("Division of Numbers are ::" + divide);
    }
}

public class Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Calculate calc = new Calculate();

        while (true) {
            System.out.print("\nEnter First Number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            System.out.println("\nChoose Operation:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("0 - Exit");
            System.out.print("Enter Operation Number: ");

            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    calc.add(num1, num2);
                    break;
                case 2:
                    calc.subtract(num1, num2);
                    break;
                case 3:
                    calc.multiply(num1, num2);
                    break;
                case 4:
                    calc.divide(num1, num2);
                    break;
                case 0:
                    System.out.println("Exiting....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Operation");
            }
        }
    }
}
