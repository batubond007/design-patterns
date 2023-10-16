package main.storage;

public interface DataSource {
    void writeData(String data);
    String readData();
}
