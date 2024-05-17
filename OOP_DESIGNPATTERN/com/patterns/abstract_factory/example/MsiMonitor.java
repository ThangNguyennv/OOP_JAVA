package com.patterns.abstract_factory.example;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        // Logic relevant to MSI Monitors
        System.out.println("Assembling MSI Monitor");
    }

    @Override
    public void display() {
        // Specific display logic for MSI Monitor
        System.out.println("Displaying on MSI Monitor");
    }

    @Override
    public void adjustBrightness() {
        // Specific brightness adjustment logic for MSI Monitor
        System.out.println("Adjusting brightness on MSI Monitor");
    }
}