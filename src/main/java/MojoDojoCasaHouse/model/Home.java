package MojoDojoCasaHouse.model;

public class Home {
    private float latitude;
    private float longitude;
    private String address;
    private int num;
    private String door;
    private int floor;

    public Home(float latitude, float longitude, String address, int num, String door, int floor) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.num = num;
        this.door = door;
        this.floor = floor;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
