package main.house;

public class StoneHouseBuilder implements Builder {
    private final StoneHouse house = new StoneHouse();

    @Override
    public void reset() {
        house.setWalls("");
        house.setDoors(0);
        house.setWindows(0);
        house.setGarage("");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Stone Wall");
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
        house.setGarage("Stone Garage");
    }

    public StoneHouse getProduct() {
        return house;
    }
}
