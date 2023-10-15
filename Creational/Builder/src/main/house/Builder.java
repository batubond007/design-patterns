package main.house;

public interface Builder {
    void reset();
    void buildWalls();
    void buildDoors(int doorCount);

    void buildWindows(int windowCount);

    void buildGarage();
}
