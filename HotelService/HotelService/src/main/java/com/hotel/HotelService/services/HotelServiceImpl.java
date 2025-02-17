package com.hotel.HotelService.services;

import com.hotel.HotelService.entities.Hotel;
import com.hotel.HotelService.reposotory.HotelRepository;
import com.hotel.HotelService.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.*;
import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId=UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel not found"));
    }
}
