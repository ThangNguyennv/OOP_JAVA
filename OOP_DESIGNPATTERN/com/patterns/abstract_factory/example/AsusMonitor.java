package com.patterns.abstract_factory.example;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        // Logic relevant to ASUS Monitors
        System.out.println("Assembling ASUS Monitor");
    }

    @Override
    public void display() {
        // Specific display logic for ASUS Monitor
        System.out.println("Displaying on ASUS Monitor");
    }

    @Override
    public void adjustBrightness() {
        // Specific brightness adjustment logic for ASUS Monitor
        System.out.println("Adjusting brightness on ASUS Monitor");
    }
}