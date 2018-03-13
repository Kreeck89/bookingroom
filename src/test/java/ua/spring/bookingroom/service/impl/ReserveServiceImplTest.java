package ua.spring.bookingroom.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import ua.spring.bookingroom.domain.Reserve;
import ua.spring.bookingroom.repository.ReserveRepository;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class ReserveServiceImplTest {

    @Mock
    private ReserveRepository reserveRepository;
    @Mock
    Reserve reserve;
    @InjectMocks
    ReserveServiceImpl reserveService;

    @Test
    public void save() {
        when(reserveRepository.save(reserve)).thenReturn(reserve);
        Reserve r = reserveService.save(reserve);
        verify(reserveRepository).save(r);
    }

    @Test
    public void getAll() {
        when(reserveRepository.findAll()).thenReturn(new LinkedList<>());
        List<Reserve> all = reserveService.getAll();
        verify(reserveRepository).findAll();
    }
}