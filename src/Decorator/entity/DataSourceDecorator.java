package Decorator.entity;

import Decorator.interfaces.DataSource;

import java.io.IOException;

public class DataSourceDecorator implements DataSource {
    public DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
     dataSource.writeData(data);
    }

    @Override
    public String readData() throws IOException {
        return dataSource.readData();
    }
}
