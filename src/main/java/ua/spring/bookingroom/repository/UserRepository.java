package ua.spring.bookingroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.spring.bookingroom.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findBySurnameAndPassword(String surname, String password);
}
