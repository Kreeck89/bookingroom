package ua.spring.bookingroom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.spring.bookingroom.domain.Breakfast;
import ua.spring.bookingroom.repository.BreakfastRepository;
import ua.spring.bookingroom.service.BreakfastService;

@Service
public class BreakfastServiceImpl implements BreakfastService {

    @Autowired
    private BreakfastRepository breakfastRepository;

    @Override
    public Breakfast save(Breakfast breakfast) {
        return breakfastRepository.save(breakfast);
    }
}
