package ua.spring.bookingroom.service;

import ua.spring.bookingroom.domain.Room;

import java.util.List;

public interface RoomService {

    Room save(Room room);

    List<Room> getAll();

    List<Room> getAllByCategory(String category);

}
