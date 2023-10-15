package main;

import main.house.Director;
import main.house.WoodHouseBuilder;

public class Main {
    public static void main(String[] args) {
        var director = new Director();
        var woodHouseBuilder = new WoodHouseBuilder();
        director.makeTreeHouse(woodHouseBuilder);
        System.out.printf("House built with %s%n", woodHouseBuilder.getProduct().getWalls());
    }
}