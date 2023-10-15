package main.house;

public class Director {
    public void makeTreeHouse(Builder builder){
        builder.buildWalls();
        builder.buildDoors(1);
        builder.buildWindows(4);
    }

    public void makeVillageHouse(Builder builder){
        builder.buildWalls();
        builder.buildDoors(2);
        builder.buildWindows(4);
    }
}
