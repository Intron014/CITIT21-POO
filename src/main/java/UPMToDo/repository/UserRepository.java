package UPMToDo.repository;

import UPMToDo.model.User;

import java.util.ArrayList;

public interface UserRepository {
    void save(User user);

    User fetch(String email, String password);
    ArrayList<User> fetchAll();
}
