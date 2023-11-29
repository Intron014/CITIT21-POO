package UPMToDo.repository;

import UPMToDo.model.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements UserRepository{
    private List<User> users;
    public InMemoryUserRepository() {
        users = new ArrayList<User>();
    }

    @Override
    public void save(User user) {
        users.add(user);
        
    }

    @Override
    public User fetch(String email, String password) {
        return users.stream().findFirst().filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password)).orElse(null);
    }

    @Override
    public ArrayList<User> fetchAll() {
        return (ArrayList<User>) users;
    }
}
