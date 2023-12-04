package MojoDojoCasaHouse.model;

import MojoDojoCasaHouse.TaxAdder;
import MojoDojoCasaHouse.enums.AdType;

public class Advertisement {
    private AdType adType;
    private House home;
    private String city;
    private String description;
    private float price;

    public Advertisement(AdType adType, House home, String city, String description, float price) {
        this.adType = adType;
        this.home = home;
        this.city = city;
        this.description = description;
        this.price = price;
    }

    public AdType getAdType() {
        return adType;
    }

    public void setAdType(AdType adType) {
        this.adType = adType;
    }

    public House getHome() {
        return home;
    }

    public void setHome(House home) {
        this.home = home;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {

        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
