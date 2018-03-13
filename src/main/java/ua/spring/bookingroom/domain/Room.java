package ua.spring.bookingroom.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "rooms")
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@room_val")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private String category;
    private Integer price;

    @OneToMany(mappedBy = "cleaningRoom")
    @JsonManagedReference
    private List<Cleaning> cleaning;

    @OneToMany(mappedBy = "breakfastRoom")
    @JsonManagedReference
    private List<Breakfast> breakfast;

    @OneToMany(mappedBy = "room")
    @JsonManagedReference
    private List<Reserve> reserve;
}
