package Decorator.entity;

import Decorator.interfaces.DataSource;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        File file = new File(fileName);
        try {
            OutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() throws IOException {
        return  Files.readAllLines(Paths.get(fileName)).toString();
    }
}
