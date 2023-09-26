package ait.calculator;

import java.util.Scanner;

public class CalculatorAppl {
    public static void main(String[] args) {
        calculator(2, 3, "add");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input digit 1 ");
            double x = scanner.nextDouble();
            System.out.println("input digit 2 ");
            double y = scanner.nextDouble();
            System.out.println("input operation: +|-|*|/  ");
            String oper = scanner.next();
            double res = calculator(x, y, oper);
            System.out.println(res);
            System.out.println("Do you want to continue? Y/N ");
            String choice = scanner.next();
            if (choice.equals("N")) {
                System.out.println(" Are You sure? Y/N");
                String choice1 = scanner.next();
                if (choice1.equals("Y")) {
                    System.out.println("Thank you for using our program.");
                    return;
                }
            }

        }

    }

    public static double calculator(double x, double y, String oper) {
        double res = 0;
        switch (oper) {

            case "+":
                res = (x + y);
                break;
            case "-":
                res = (x - y);
                break;
            case "*":
                res = (x * y);
                break;
            case "/":
                res = (x / y);
                break;
            default:
                System.out.println("0");
        }
        return res;
    }
}
