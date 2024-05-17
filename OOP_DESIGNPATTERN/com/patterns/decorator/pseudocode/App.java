package com.patterns.decorator.pseudocode;
public class App {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("salary records!");

        source = new CompressionDecorator(source);
        source.writeData("salary records!");

        source = new EncryptionDecorator(source);
        source.writeData("salary records!");
    }
}
