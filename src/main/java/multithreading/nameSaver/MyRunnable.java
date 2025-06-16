package multithreading.nameSaver;


import config.ConfigLoader;

public class MyRunnable implements Runnable {
    private final int interval = ConfigLoader.getNameSaverInterval();

    @Override
    public void run() {
        for (int i = 1; i <= interval; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            if (i == interval) {
                System.out.println("Time's up!");
                System.exit(0);
            }
        }
    }
}
