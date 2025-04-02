package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        userRepository.addUser(new User(1, "Vlad", "vlad@gmail.com"));
        userRepository.addUser(new User(2, "Valentin", "valentin@gmail.com"));
        userRepository.addUser(new User(3, "Tolik", "tolik@gmail.com"));
        userRepository.addUser(new User(4, "Ann", "ann@gmail.com"));
        userRepository.addUser(new User(5, "Vania", "vania@gmail.com"));

        Optional<User> findById = userRepository.findUserById(3);
        findById.ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("Couldn't find")
        );



        Optional<User> findByEmail = userRepository.findUserByEmail("valentin@gmail.com");
        findByEmail.ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("Couldn't find")
        );

        Optional<List<User>> listOptional = userRepository.findAllUsers();
        listOptional.ifPresentOrElse(System.out::println,
                ()-> System.out.println("Couldn't find"));


        UserRepository userRepository1 = new UserRepository();

        Optional<User> findById1 = userRepository1.findUserById(4);
        findById1.ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("Couldn't find")
        );



        Optional<User> findByEmail1 = userRepository1.findUserByEmail("valentin@gmail.com");
        findByEmail1.ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("Couldn't find")
        );

        Optional<List<User>> listOptional1 = userRepository1.findAllUsers();
        listOptional1.ifPresentOrElse(List::size,
                ()-> System.out.println("Couldn't find"));
    }

}




