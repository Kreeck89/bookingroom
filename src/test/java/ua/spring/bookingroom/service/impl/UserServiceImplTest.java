package ua.spring.bookingroom.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import ua.spring.bookingroom.domain.User;
import ua.spring.bookingroom.repository.UserRepository;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    User user;
    @InjectMocks
    UserServiceImpl userService;

    @Test
    public void save() {
        when(userRepository.save(user)).thenReturn(user);
        User u = userService.save(user);
        verify(userRepository).save(u);
    }

    @Test
    public void getAll() {
        when(userRepository.findAll()).thenReturn(new LinkedList<>());
        List<User> all = userService.getAll();
        verify(userRepository).findAll();
    }

    @Test
    public void getBySurnameAndPassword() {
        when(userRepository.findBySurnameAndPassword("", "")).thenReturn(user);
        User u = userService.getBySurnameAndPassword("", "");
        verify(userRepository).findBySurnameAndPassword("", "");
    }
}