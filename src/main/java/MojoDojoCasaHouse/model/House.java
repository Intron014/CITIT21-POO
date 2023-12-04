package MojoDojoCasaHouse.model;

import MojoDojoCasaHouse.enums.HomeType;

public class House {
    private float latitude;
    private float longitude;
    private String address;
    private int num;
    private HomeType homeType;


    public House(float latitude, float longitude, String address, int num){
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.num = num;
        this.homeType = HomeType.UNIFAMILIAR;
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

    public HomeType getHomeType() {
        return homeType;
    }

    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }
}
