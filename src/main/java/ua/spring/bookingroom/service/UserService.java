package ua.spring.bookingroom.service;

import ua.spring.bookingroom.domain.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> getAll();

    User getBySurnameAndPassword(String surname, String password);
}
