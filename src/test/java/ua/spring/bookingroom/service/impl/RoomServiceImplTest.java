package ua.spring.bookingroom.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import ua.spring.bookingroom.domain.Room;
import ua.spring.bookingroom.repository.ReserveRepository;
import ua.spring.bookingroom.repository.RoomRepository;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class RoomServiceImplTest {

    @Mock
    private RoomRepository roomRepository;
    @Mock
    Room room;
    @InjectMocks
    RoomServiceImpl roomService;

    @Test
    public void save() {
        when(roomRepository.save(room)).thenReturn(room);
        Room r = roomService.save(room);
        verify(roomRepository).save(r);
    }

    @Test
    public void getAll() {
        when(roomRepository.findAll()).thenReturn(new LinkedList<>());
        List<Room> all = roomService.getAll();
        verify(roomRepository).findAll();
    }

    @Test
    public void getAllByCategory() {
        String string = "LUX";
        when(roomRepository.findAllByCategory(string)).thenReturn(new LinkedList<>());

        List<Room> lux = roomService.getAllByCategory(string);
        int count = 0;
        for (Room room : lux) {
            if (room.getCategory().equals(string)) {
                count++;
            }
        }
        assertSame(count, lux.size());

        verify(roomRepository).findAllByCategory(string);
    }
}