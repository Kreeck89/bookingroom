package ua.spring.bookingroom.service;

import ua.spring.bookingroom.domain.Room;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface RoomService {

    Room save(Room room);

    List<Room> getAll();

    List<Room> getAllByCategory(String category);

}
