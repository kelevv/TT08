package topics.exceptions;

import java.util.Scanner;

public class CustomExceptionStudy {
    public static void run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e);
        }
    }

    private static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be 18+");
        } else {
            System.out.println("Success!");
        }
    }
}
