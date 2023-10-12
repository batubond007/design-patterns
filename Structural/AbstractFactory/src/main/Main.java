package main;

public class Main {
    public static void main(String[] args) {
        switch (args[1]) {
            case "Windows" -> new Application(new WindowsGUIFactory()).render();
            case "MacOS" -> new Application(new MacOSGUIFactory()).render();
            default -> throw new IllegalStateException("Unexpected value: " + args[1]);
        }
    }
}
