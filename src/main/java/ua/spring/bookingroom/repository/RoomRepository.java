package ua.spring.bookingroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.spring.bookingroom.domain.Room;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findAllByCategory(String category);
}
