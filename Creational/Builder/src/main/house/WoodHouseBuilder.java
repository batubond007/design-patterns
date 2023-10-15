package main.house;

public class WoodHouseBuilder implements Builder{
    private final WoodHouse house= new WoodHouse();
    @Override
    public void reset() {
        house.setWalls("");
        house.setDoors(0);
        house.setWindows(0);
        house.setGarage("");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Wooden Wall");
    }

    @Override
    public void buildDoors(int doorCount) {
        house.setDoors(doorCount);
    }

    @Override
    public void buildWindows(int windowCount) {
        house.setWindows(windowCount);
    }

    @Override
    public void buildGarage() {
        house.setGarage("Wooden Garage");
    }

    public WoodHouse getProduct() {
        return house;
    }
}
