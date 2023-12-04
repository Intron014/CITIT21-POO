package MojoDojoCasaHouse.model;

import java.util.ArrayList;
import java.util.List;

public class Agency {

    private List<Advertisement> advertisements;

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
}
