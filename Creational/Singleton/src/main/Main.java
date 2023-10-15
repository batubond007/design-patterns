package main;

public class Main {
    public static void main(String[] args) {
        var dclSingleton = DCLSingleton.getInstance();
        dclSingleton.setValue(5);
        System.out.println(dclSingleton.getValue());

        var enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setValue(5);
        System.out.println(enumSingleton.getValue());
    }
}