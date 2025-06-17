import config.ConfigLoader;
import topics.exceptions.CustomExceptionStudy;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("InstantiationOfUtilityClass")
        ConfigLoader config = new ConfigLoader();

        // PingPong.run();
        // NameSaver.run();
        // Exception.run();
        CustomExceptionStudy.run();

    }
}
