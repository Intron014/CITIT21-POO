package MojoDojoCasaHouse.model;

import MojoDojoCasaHouse.TaxAdder;

import java.util.ArrayList;
import java.util.List;

public class Agency {

    private List<Advertisement> advertisements;
    private TaxAdder taxAdder;

    public Agency() {
        this.advertisements = new ArrayList<>();
    }
    public List<Advertisement> findNearby(String city, Double radius, Double latitude, Double longitude) {
        List<Advertisement> nearby = new ArrayList<>();
        for (Advertisement advertisement : advertisements) {
            if (advertisement.getCity().equals(city)) {
                House home = advertisement.getHome();
                double distancia = distanciaKm(latitude, longitude, home.getLatitude(), home.getLongitude());
                if (distancia <= radius) {
                    nearby.add(advertisement);
                }
            }
        }
        return nearby;
    }
    public List<Advertisement> find5CheapestHousesWithTax(String city) {
        List<Advertisement> cheapest = new ArrayList<>();
        for (Advertisement advertisement : advertisements) {
            if (advertisement.getCity().equals(city)) {
                if (cheapest.size() < 5) {
                    cheapest.add(advertisement);
                } else {
                    for (Advertisement ad : cheapest) {
                        if (getTaxedPrice(ad) > getTaxedPrice(advertisement)) {
                            cheapest.remove(ad);
                            cheapest.add(advertisement);
                            break;
                        }
                    }
                }
            }
        }
        return cheapest;
    }

    private double distanciaKm(double lat1, double lon1, double lat2,
                               double lon2) {
        double lat1rad = Math.toRadians(lat1);
        double lon1rad = Math.toRadians(lon1);
        double lat2rad = Math.toRadians(lat2);
        double lon2rad = Math.toRadians(lon2);
        double difLatitud = lat1rad - lat2rad;
        double difLongitud = lon1rad - lon2rad;
        double a = Math.pow(Math.sin(difLatitud/2), 2) +
                Math.cos(lat1rad) *
                        Math.cos(lat2rad) *
                        Math.pow(Math.sin(difLongitud/2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double radioTierraKm = 6378.0;
        double distancia = radioTierraKm * c;
        return distancia;
    }

    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(List<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public float getTaxedPrice(Advertisement advertisement){
        return taxAdder.getLeTax(advertisement);
    }

}
