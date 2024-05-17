package com.patterns.abstract_factory.example;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        // Logic relevant to ASUS GPUs
        System.out.println("Assembling ASUS GPU");
    }
    @Override
    public void renderGraphics() {
        // Specific graphics rendering logic for ASUS GPU
        System.out.println("Rendering graphics with ASUS GPU");
    }
    @Override
    public void overclock() {
        // Specific overclocking logic for ASUS GPU
        System.out.println("Overclocking ASUS GPU");
    }
}