package ua.spring.bookingroom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.spring.bookingroom.domain.Room;
import ua.spring.bookingroom.repository.RoomRepository;
import ua.spring.bookingroom.service.RoomService;

import java.time.LocalDate;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> getAllByCategory(String category) {
        return roomRepository.findAllByCategory(category);
    }

}
