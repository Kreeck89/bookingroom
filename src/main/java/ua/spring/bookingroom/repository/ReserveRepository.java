package ua.spring.bookingroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.spring.bookingroom.domain.Reserve;

import java.time.LocalDate;
import java.util.List;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {

}
