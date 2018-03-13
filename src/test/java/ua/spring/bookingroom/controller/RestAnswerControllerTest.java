package ua.spring.bookingroom.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import ua.spring.bookingroom.domain.Room;
import ua.spring.bookingroom.service.ReserveService;
import ua.spring.bookingroom.service.RoomService;
import ua.spring.bookingroom.service.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

@RunWith(SpringRunner.class)
//@SpringJUnitWebConfig(classes = BookingRoomApplication.class)
//@WebAppConfiguration
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:schema.sql")
public class RestAnswerControllerTest {

    @Mock
    private RestTemplate template;
    @Mock
    ReserveService reserveService;
    @Mock
    RoomService roomService;
    @Mock
    UserService userService;
    @InjectMocks
    RestAnswerController restAnswerController;

    @Test
    public void getAllReserves() {

        ResponseEntity<Map<String, List<Room>>> exchange = template.exchange("http://localhost:8080/rest/allReserves", HttpMethod.GET,
                null, new ParameterizedTypeReference<Map<String, List<Room>>>() {
                });
        assertThat(exchange, is(nullValue()));
//        Map<String, List<Room>> body = exchange.getBody();

    }

    @Test
    public void getFreeRooms() {
        ResponseEntity<Set<Room>> exchange = template.exchange("http://localhost:8080/rest/allFreeRooms", HttpMethod.POST,
                null, new ParameterizedTypeReference<Set<Room>>() {
                });
        assertThat(exchange, is(nullValue()));
    }

    @Test
    public void summaryPrice() {
        ResponseEntity<Integer> exchange = template.exchange("http://localhost:8080/rest/summary", HttpMethod.POST,
                null, new ParameterizedTypeReference<Integer>() {
                });
        assertThat(exchange, is(nullValue()));
    }

    @Test
    public void userReserves() {
        ResponseEntity<Map<LocalDate, Room>> exchange = template.exchange("http://localhost:8080/rest/reserves", HttpMethod.POST,
                null, new ParameterizedTypeReference<Map<LocalDate, Room>>() {
                });
        assertThat(exchange, is(nullValue()));
    }

    @Test
    public void withFilter() {
        ResponseEntity<Map<String, List<?>>> exchange = template.exchange("http://localhost:8080/rest/withFilter", HttpMethod.POST,
                null, new ParameterizedTypeReference<Map<String, List<? extends Object>>>() {
                });
        assertThat(exchange, is(nullValue()));
    }
}