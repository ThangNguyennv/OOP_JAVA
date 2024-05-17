package com.patterns.abstract_factory.example;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}