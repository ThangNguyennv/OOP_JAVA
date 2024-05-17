package com.patterns.abstract_factory.pseudocode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ApplicationConfigurator {
    public static void main(String[] args) {
        ApplicationConfig config = readApplicationConfigFile();

        GUIFactory factory;
        if (config.getOS().equals("Windows")) {
            factory = new WinFactory();
        } else if (config.getOS().equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }

    private static ApplicationConfig readApplicationConfigFile() {
        // Read and parse the application configuration file.
        // Assuming the configuration is stored in a file named "config.txt"
        // and contains a single line specifying the operating system.
        String os = ""; // Placeholder variable
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\GoogleDrive\\JAVA_SCHOOL\\OOP_DESIGNPATTERN\\com\\patterns\\abstract_factory\\pseudocode\\config.txt"));
            os = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ApplicationConfig(os);
    }
}