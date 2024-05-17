package com.patterns.decorator.pseudocode;

public class FileDataSource implements DataSource {
    private String filename;
    public FileDataSource(String filename) {
        this.filename = filename;
    }
    @Override
    public void writeData(String data) {
        System.out.println(data);
    }

    @Override
    public String readData() {
        String data = "Data from file";
        return data;
    }
}
