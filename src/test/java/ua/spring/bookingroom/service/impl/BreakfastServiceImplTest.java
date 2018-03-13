package ua.spring.bookingroom.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import ua.spring.bookingroom.domain.Breakfast;
import ua.spring.bookingroom.repository.BreakfastRepository;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class BreakfastServiceImplTest {

    @Mock
    private BreakfastRepository breakfastRepository;
    @Mock
    Breakfast breakfast;
    @InjectMocks
    BreakfastServiceImpl breakfastService;

    @Test
    public void save() {
        when(breakfastRepository.save(breakfast)).thenReturn(breakfast);
        Breakfast b = breakfastService.save(breakfast);
        verify(breakfastRepository).save(b);
    }
}