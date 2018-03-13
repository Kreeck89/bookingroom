package ua.spring.bookingroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.spring.bookingroom.service.ReserveService;

/**
 * It`s controller accept requests
 * and returns strings for mapping to *.jsp pages.
 */
@Controller
@RequestMapping("")
public class MainController {

    @Autowired
    ReserveService service;

    @RequestMapping()
    public String mainPage(Model model) {
        return "index";
    }

    @RequestMapping("/registration")
    public String viewAllInfo(Model model) {
        return "registration";
    }

    @RequestMapping("/userSum")
    public String showUsersSum(Model model) {
        return "userSum";
    }

    @RequestMapping("/userReserves")
    public String showUsersReserves(Model model) {
        return "userReserves";
    }

    @RequestMapping("/reservation")
    public String goOnPageWithFilter() {
        return "reservation";
    }

    @RequestMapping("/freeRooms")
    public String freeRooms() {
        return "/freeRoomsByDays";
    }

    @RequestMapping("/filters")
    public String withFilters() {
        return "filters";
    }
}
