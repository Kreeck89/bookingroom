package ua.spring.bookingroom.service;

import ua.spring.bookingroom.domain.Reserve;

import java.util.List;

public interface ReserveService {

    Reserve save(Reserve reserve);

    List<Reserve> getAll();
}
