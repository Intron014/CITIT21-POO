package MojoDojoCasaHouse;

import MojoDojoCasaHouse.model.Advertisement;
import MojoDojoCasaHouse.model.House;

public class TaxAdder {

    public float getLeTax(Advertisement ad) {
        float priceWithTax = ad.getPrice();
        if (ad.getHome().getHomeType().toString().equals("PISO")) {
            if(ad.getAdType().toString().equals("RENT")) {
                priceWithTax = ad.getPrice() * 1.21f;
            } else if (ad.getAdType().toString().equals("SALE")) {
                priceWithTax = ad.getPrice() * 1.05f;
            }
        } else if (ad.getHome().getHomeType().toString().equals("UNIFAMILIAR")) {
            if(ad.getAdType().toString().equals("RENT")) {
                priceWithTax = ad.getPrice() * 1.27f;
            } else if (ad.getAdType().toString().equals("SALE")) {
                priceWithTax = ad.getPrice() * 1.08f;
            }
        }
        return priceWithTax;
    }



}
