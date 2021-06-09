package Decorator;

import Decorator.entity.CompressionDecorator;
import Decorator.entity.DataSourceDecorator;
import Decorator.entity.EncryptionDecorator;
import Decorator.entity.FileDataSource;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C://userDirectory/file.txt";
        DataSourceDecorator decorator = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(fileName)));
        decorator.readData();
        decorator.writeData("new data");
    }
}
