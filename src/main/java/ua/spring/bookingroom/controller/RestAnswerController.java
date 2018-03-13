package ua.spring.bookingroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.spring.bookingroom.domain.*;
import ua.spring.bookingroom.service.ReserveService;
import ua.spring.bookingroom.service.RoomService;
import ua.spring.bookingroom.service.UserService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Controller for return REST response.
 */
@RestController
@RequestMapping("/rest")
public class RestAnswerController {

    @Autowired
    ReserveService reserveService;
    @Autowired
    RoomService roomService;
    @Autowired
    UserService userService;

    /**
     * @return All reserved rooms what have in database.
     */
    @RequestMapping("/allReserves")
    public Map<String, List<Room>> getAllReserves() {
        Map<String, List<Room>> freeRooms = new HashMap<>();
        List<Reserve> allRepository = reserveService.getAll();
        List<Room> allRooms = roomService.getAll();
        for (Reserve reserve : allRepository) {
            List<Room> rooms = new ArrayList<>();
            for (Room room : allRooms) {
                if (room.getId().equals(reserve.getRoom().getId())) {
                    rooms.add(room);
                }
            }
            freeRooms.put(reserve.getUser().getSurname(), rooms);
        }
        return freeRooms;

    }

    /**
     * @param from request String param starts date for found free rooms.
     * @param to request String param ends date for found free rooms.
     * And converts this Strings to Local Data
     * And search free rooms in this dates and save to set "freeRooms".
     * @return Set<Room> what don`t have any reserves or reserves on this days.
     */
    @RequestMapping("/allFreeRooms")
    public Set<Room> getFreeRooms(@RequestParam String from, @RequestParam String to) {
        List<Room> roomList = roomService.getAll();
        Set<Room> roomSet = new HashSet<>();
        Set<Room> freeRooms = new HashSet<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dateFrom = LocalDate.parse(from, formatter);
        LocalDate dateTo = LocalDate.parse(to, formatter);

        for (Room room : roomList) {
            while (!dateFrom.isAfter(dateTo)) {
                for (Reserve reserve : room.getReserve()) {
                    if (reserve.getDate().equals(dateFrom)) {
                        roomSet.add(room);
                    }
                }
                dateFrom = dateFrom.plusDays(1);
            }
            if (roomSet.isEmpty()) {
                freeRooms.add(room);
            } else {
                roomSet.clear();
            }
            dateFrom = LocalDate.parse(from, formatter);
        }
        return freeRooms;
    }

    /**
     * @param modelMap for some change what we can add in future(don`t use now, for example).
     * @param surname request param for search and check user.
     * @param password request param for search and check user.
     * @return Integer value with summary price for booked room by this user.
     */
    @RequestMapping(value = "/summary", method = RequestMethod.POST)
    public Integer summaryPrice(ModelMap modelMap, @RequestParam String surname, @RequestParam String password) {
        Integer price = 0;
        List<User> collect = userService.getAll().stream()
                .filter(user -> user.getSurname().equals(surname) && user.getPassword().equals(password))
                .collect(Collectors.toList());
        User user = collect.get(0);
        for (Reserve reserve : user.getReserve()) {
            price += reserve.getRoom().getPrice();
            for (Cleaning cleaning : reserve.getRoom().getCleaning()) {
                price += cleaning.getPrice();
            }
            for (Breakfast breakfast : reserve.getRoom().getBreakfast()) {
                price += breakfast.getPrice();
            }
        }
        return price;
    }

    /**
     * @param surname request param for search and check user.
     * @param password request param for search and check user.
     * If don`t found registered user will be exception.
     *
     * @return HashMap with reserves by key=LocalData, value=Room.
     */
    @RequestMapping(value = "reserves", method = RequestMethod.POST)
    public Map<LocalDate, Room> userReserves(@RequestParam String surname, @RequestParam String password) {
        Map<LocalDate, Room> reserves = new HashMap<>();
        List<User> users = userService.getAll().stream()
                .filter(user -> user.getSurname().equals(surname) && user.getPassword().equals(password))
                .collect(Collectors.toList());
        for (Reserve reserve : users.get(0).getReserve()) {
            reserves.put(reserve.getDate(), reserve.getRoom());
        }

        return reserves;
    }

    /**
     * @param filter request param for filter searching rooms.
     * @return HashMap with key=String and value=List<Room>...
     *
     * In future here may be other filters and be changed this Map!
     */
    @RequestMapping("/withFilter")
    public Map<String, List<? extends Object>> withFilter(@RequestParam String filter) {
        Map<String, List<? extends Object>> listWithFilters = new HashMap<>();

        List<Room> rooms = roomService.getAllByCategory(filter);
        listWithFilters.put("Rooms", rooms);
        return listWithFilters;
    }
}
