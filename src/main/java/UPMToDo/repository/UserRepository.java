package UPMToDo.repository;

import UPMToDo.model.User;

public interface UserRepository {
    void save(User user);

    User fetch(String email, String password);
}
