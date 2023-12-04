package MojoDojoCasaHouse;

import MojoDojoCasaHouse.model.Advertisement;
import MojoDojoCasaHouse.model.House;

public class TaxAdder {

    private final static float PISO_RENT = 1.21f;
    private final static float PISO_SALE = 1.05f;
    private final static float UNIFAMILIAR_RENT = 1.27f;
    private final static float UNIFAMILIAR_SALE = 1.08f;

    public float getLeTax(Advertisement ad) {
        float priceWithTax = ad.getPrice();
        if (ad.getHome().getHomeType().toString().equals("PISO")) {
            if(ad.getAdType().toString().equals("RENT")) {
                priceWithTax = ad.getPrice() * PISO_RENT;
            } else if (ad.getAdType().toString().equals("SALE")) {
                priceWithTax = ad.getPrice() * PISO_SALE;
            }
        } else if (ad.getHome().getHomeType().toString().equals("UNIFAMILIAR")) {
            if(ad.getAdType().toString().equals("RENT")) {
                priceWithTax = ad.getPrice() * UNIFAMILIAR_RENT;
            } else if (ad.getAdType().toString().equals("SALE")) {
                priceWithTax = ad.getPrice() * UNIFAMILIAR_SALE;
            }
        }
        return priceWithTax;
    }



}
