package UPMToDo;

import java.time.LocalDate;

public class User {
    private String username;
    private String password;
    private String email;
    private String bio;
    private LocalDate birthDate;

    public User(String username, String password, String email, LocalDate birthDate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
