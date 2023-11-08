package PetWalkerManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String name;
    private String email;
    private LocalDate birthday;
    private String password;
    private List<Pet> ownPets;

    public Usuario(String name, String email, LocalDate birthday, String password) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.password = password;
        ownPets = new ArrayList<>();
    }

    public List<Pet> getOwnPets() {
        return ownPets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
