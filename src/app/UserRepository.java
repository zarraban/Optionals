package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepository {
    private final List<User> list;


    public UserRepository() {
        this.list = new ArrayList<>();


    }


    public void addUser(User user) {
        list.add(user);
    }

    public Optional<User> findUserById(int id) {
        return list.stream().filter(user -> user.getId() == id).findFirst();
    }

    public Optional<User> findUserByEmail(String email) {
        return list.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    public Optional<List<User>> findAllUsers() {
        return Optional.of(list);
    }
}
