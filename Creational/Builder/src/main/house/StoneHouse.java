package main.house;

public class StoneHouse {
    private String walls;
    private int doors;
    private int windows;
    private String garage;

    public String getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public String getGarage() {
        return garage;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }
}
