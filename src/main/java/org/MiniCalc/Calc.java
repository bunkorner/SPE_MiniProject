package org.MiniCalc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    private static final Logger logger = LogManager.getLogger(Calc.class);
    public Calc() {
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Choose operation:");
            System.out.println("1. Factorial");
            System.out.println("2. Square root");
//            System.out.println("3. Power");
//            System.out.println("4. Natural Logarithm");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // Square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.squareRoot(number1));
                    System.out.println("\n");

                    break;
//                case 3:
//                    // Power
//                    System.out.print("Enter the first number : ");
//                    number1 = scanner.nextDouble();
//                    System.out.print("Enter the second number : ");
//                    number2 = scanner.nextDouble();
//                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
//                    System.out.println("\n");
//                    break;
//                case 4:
//                    // Natural log
//                    System.out.print("Enter a number : ");
//                    number1 = scanner.nextDouble();
//                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
//                    System.out.println("\n");
//
//                    break;
                default:
                    System.out.println("Bye Bye!");
                    return;
            }
        } while (true);
    }


    public double factorial(double number1) {
        logger.info("[Factorial] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - Factorial] - " + result);
        return result;
    }



    public double squareRoot(double number1) {
        logger.info("[Square Root] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - Square Root] - " + result);
        return result;
    }
//
//
//    public double power(double number1, double number2) {
//        double result = Math.pow(number1,number2);
//        return result;
//    }
//
//    public double naturalLog(double number1) {
//        double result = 0;
//        try {
//
//            if (number1 <0 ) {
//                result = Double.NaN;
//                throw new ArithmeticException("Case of NaN 0.0/0.0");
//            }
//            else {
//                result = Math.log(number1);
//            }
//        } catch (ArithmeticException error) {
//            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
//        }
//        return result;
//    }
    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}
