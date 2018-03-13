package ua.spring.bookingroom.service;

import ua.spring.bookingroom.domain.Reserve;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ReserveService {

    Reserve save(Reserve reserve);

    List<Reserve> getAll();
}
