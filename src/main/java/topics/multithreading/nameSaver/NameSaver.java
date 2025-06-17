package topics.multithreading.nameSaver;

import config.ConfigLoader;

import java.util.Scanner;

public class NameSaver {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have " + ConfigLoader.getNameSaverInterval()
                + " seconds to enter your name.");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        scanner.close();
    }
}
