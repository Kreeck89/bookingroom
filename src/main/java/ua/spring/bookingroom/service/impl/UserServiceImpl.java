package ua.spring.bookingroom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.spring.bookingroom.domain.User;
import ua.spring.bookingroom.repository.UserRepository;
import ua.spring.bookingroom.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getBySurnameAndPassword(String surname, String password) {
        return userRepository.findBySurnameAndPassword(surname, password);
    }


}
