package ua.spring.bookingroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.spring.bookingroom.domain.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {

}
