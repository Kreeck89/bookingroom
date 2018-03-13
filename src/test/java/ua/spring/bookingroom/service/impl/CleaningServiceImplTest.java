package ua.spring.bookingroom.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import ua.spring.bookingroom.domain.Cleaning;
import ua.spring.bookingroom.repository.CleaningRepository;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class CleaningServiceImplTest {

    @Mock
    private CleaningRepository cleaningRepository;
    @Mock
    Cleaning cleaning;
    @InjectMocks
    CleaningServiceImpl cleaningService;

    @Test
    public void save() {
        when(cleaningRepository.save(cleaning)).thenReturn(cleaning);
        Cleaning c = cleaningService.save(cleaning);
        verify(cleaningRepository).save(c);
    }
}