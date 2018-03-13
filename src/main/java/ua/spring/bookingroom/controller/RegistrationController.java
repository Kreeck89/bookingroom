package ua.spring.bookingroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.spring.bookingroom.domain.Reserve;
import ua.spring.bookingroom.domain.Room;
import ua.spring.bookingroom.domain.User;
import ua.spring.bookingroom.service.ReserveService;
import ua.spring.bookingroom.service.RoomService;
import ua.spring.bookingroom.service.UserService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;

/**
 * Controller for registration processes.
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    public UserService userService;
    @Autowired
    public ReserveService reserveService;
    @Autowired
    public RoomService roomService;

    /**
     * This method request some params for save new user into database.
     *
     * @param modelMap for some changes in future if will need.
     * @param name     request param for save user`s name.
     * @param surname  request param for save user`s surname.
     * @param password request param for save user`s password.
     * @return String with mapping to the next page *.jsp.
     */
    @RequestMapping(method = RequestMethod.POST)
    public String registerNewUser(ModelMap modelMap, @RequestParam String name, @RequestParam String surname, @RequestParam String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setSurname(surname);
        userService.save(user);
        return "index";
    }

    /**
     * This method receive some requests:
     * 1. Converts Strings with data to Local Data,
     * 2. Receives user by request params (surname and password). If don`t register will show error,
     * 3. Receives List<Room> by requested param String category,
     * 4. Receives List<Reserve> and found what room is FREE in this days (from - to).
     * If have free room in this days and with this params will register and mapping to "index.jsp" page;
     * If don`t have free rooms will mapping to "freeRoomsByDays.jsp" page for look what free rooms in your dates.
     *
     * @param surname  request param for checks registered user.
     * @param password request param for checks registered user.
     * @param category request param for found rooms by choose category.
     * @param from     request param for mark start booking room date.
     * @param to       request param for mark end booking room date.
     * @return String for mapping to *.jsp page.
     */
    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
    public String reservation(@RequestParam String surname, @RequestParam String password, @RequestParam String category,
                              @RequestParam String from, @RequestParam String to) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dateFrom = LocalDate.parse(from, formatter);
        LocalDate dateTo = LocalDate.parse(to, formatter);

        User reservationUser = userService.getBySurnameAndPassword(surname, password);
        List<Room> allByCategory = roomService.getAllByCategory(category);
        List<Reserve> reserves = reserveService.getAll();
        HashSet<Room> res = new HashSet<>();
        HashSet<Room> filteredRes = new HashSet<>();

        while (!dateFrom.isAfter(dateTo)) {
            for (Reserve reserve : reserves) {
                if (reserve.getDate().equals(dateFrom)) {
                    res.add(reserve.getRoom());
                }
            }
            dateFrom = dateFrom.plusDays(1);
        }

        for (Room filteredRoom : allByCategory) {
            for (Room room : res) {

                System.out.println(filteredRoom.getNumber());
                System.out.println(room.getNumber());

                if (filteredRoom.getNumber().equals(room.getNumber())) {
                    filteredRes.add(room);
                }
                if (filteredRes.isEmpty()) {
                    dateFrom = LocalDate.parse(from, formatter);
                    while (!dateFrom.isAfter(dateTo)) {
                        Reserve reserve = new Reserve();
                        reserve.setRoom(filteredRoom);
                        reserve.setUser(reservationUser);
                        reserve.setDate(dateFrom);
                        reserveService.save(reserve);
                        dateFrom = dateFrom.plusDays(1);
                    }
                    return "index";
                }
            }
        }

        return "freeRoomsByDays";
    }
}
