package MojoDojoCasaHouse.model;


import MojoDojoCasaHouse.enums.HomeType;

public class Flat extends House {
    private String door;
    private int floor;

    public Flat (float latitude, float longitude, String address, int num, String door, int floor) {
        super(latitude, longitude, address, num);
        this.door = door;
        this.floor = floor;
        this.setHomeType(HomeType.PISO);
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
