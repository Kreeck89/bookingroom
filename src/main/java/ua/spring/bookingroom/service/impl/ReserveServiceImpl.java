package ua.spring.bookingroom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.spring.bookingroom.domain.Reserve;
import ua.spring.bookingroom.repository.ReserveRepository;
import ua.spring.bookingroom.service.ReserveService;

import java.util.List;

@Service
public class ReserveServiceImpl implements ReserveService {

    @Autowired
    private ReserveRepository reserveRepository;

    @Override
    public Reserve save(Reserve reserve) {
        return reserveRepository.save(reserve);
    }

    @Override
    public List<Reserve> getAll() {
        return reserveRepository.findAll();
    }
}
