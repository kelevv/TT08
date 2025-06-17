package topics.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy {
    public static void run() {
        //exception - an event that occurs during the execution of a program that, disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException ae) {
            System.out.println("Can't divide by zero.");
        } catch (InputMismatchException ie) {
            System.out.println("Please enter a number.");
        } catch (java.lang.Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The end of instructions.");
            scanner.close();
        }
    }
}
