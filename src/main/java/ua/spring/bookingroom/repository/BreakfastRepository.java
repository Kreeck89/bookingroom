package ua.spring.bookingroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.spring.bookingroom.domain.Breakfast;

public interface BreakfastRepository extends JpaRepository<Breakfast, Long> {
}
