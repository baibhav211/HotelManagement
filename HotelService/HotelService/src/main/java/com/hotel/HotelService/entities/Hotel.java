package com.hotel.HotelService.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hotels")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String location;
    private String about;
}
