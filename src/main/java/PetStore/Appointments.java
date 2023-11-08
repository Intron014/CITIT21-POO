package PetStore;

import java.time.LocalDate;

public class Appointments {
    private LocalDate date;
    private String prognosis;
    private float price;

    public Appointments(LocalDate date, String prognosis, float price) {
        this.date = date;
        this.prognosis = prognosis;
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPrognosis() {
        return prognosis;
    }

    public void setPrognosis(String prognosis) {
        this.prognosis = prognosis;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
