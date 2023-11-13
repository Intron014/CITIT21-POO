package PetWalkerManager.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private int age;
    private String password;
    private List<Pet> ownPets;
    private List<Pet> walks;

    public User(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.ownPets = new ArrayList<>();
        this.walks = new ArrayList<>();
    }

    public List<Pet> getOwnPets() {
        return ownPets;
    }

    public void setOwnPets(List<Pet> ownPets) {
        this.ownPets = ownPets;
    }

    public List<Pet> getWalks() {
        return walks;
    }

    public void setWalks(List<Pet> walks) {
        this.walks = walks;
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

    public int getBirthday() {
        return age;
    }

    public void setBirthday(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
