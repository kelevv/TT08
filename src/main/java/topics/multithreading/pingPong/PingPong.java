package topics.multithreading.pingPong;

public class PingPong {
    public static void run() {
        Thread t1 = new Thread(new MyRunnable("PING"));
        Thread t2 = new Thread(new MyRunnable("PONG"));
        System.out.println("GAME START!");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");
    }
}
