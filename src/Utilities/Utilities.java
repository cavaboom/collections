package Utilities;

public class Utilities {
    public static String check(String string) {
        if (string == null || string.isEmpty()) {
            return "default";
        } else {
            return string;
        }
    }

    public static double check(double engineVolume) {
        if (engineVolume <= 0) {
            return 1.5;
        } else {
            return engineVolume;
        }
    }
}
