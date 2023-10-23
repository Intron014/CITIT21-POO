package pet_store.modelo;

import java.time.LocalDate;

public class Owner extends User{
    private LocalDate birthday;
    private String phoneNumber;

    public Owner(String email, String password, String name, String dni, LocalDate birthday, String phoneNumber) {
        super(email, password, name, dni);
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
