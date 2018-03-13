package ua.spring.bookingroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.spring.bookingroom.domain.Cleaning;

public interface CleaningRepository extends JpaRepository<Cleaning, Long> {
}
