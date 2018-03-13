package ua.spring.bookingroom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.spring.bookingroom.domain.Cleaning;
import ua.spring.bookingroom.repository.CleaningRepository;
import ua.spring.bookingroom.service.CleaningService;

@Service
public class CleaningServiceImpl implements CleaningService {

    @Autowired
    private CleaningRepository cleaningRepository;

    @Override
    public Cleaning save(Cleaning cleaning) {
        return cleaningRepository.save(cleaning);
    }
}
