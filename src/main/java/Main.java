import config.ConfigLoader;
import multithreading.nameSaver.NameSaver;
import multithreading.pingPong.PingPong;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("InstantiationOfUtilityClass")
        ConfigLoader config = new ConfigLoader();

        // PingPong.run();
        NameSaver.run();
    }
}
