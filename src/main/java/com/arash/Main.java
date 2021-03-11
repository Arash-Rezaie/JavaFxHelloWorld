package com.arash;

/**
 * In case of using fat-jar, classLoader is not able to load this class if it extends Application,
 * so this class just calls an Application class, but it itself doesn't extent Application
 */
public class Main {
    public static void main(String[] args) {
        UiLauncher.main(args);
    }
}
