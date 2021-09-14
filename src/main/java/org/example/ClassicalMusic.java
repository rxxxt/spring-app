package org.example;

public class ClassicalMusic implements Music {

    private void myInit() {
        System.out.println("My initialization");
    }

    private void myDestroy() {
        System.out.println("My destroy");
    }

    @Override
    public String getSong() {
        return "🎻🎻🎻🎻🎻";
    }
}
