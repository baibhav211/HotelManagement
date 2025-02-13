//package com.user.service.external.services;
//
//
//import com.user.service.Entities.Rating;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//
//@FeignClient(name = "RatingService")
//public interface RatingService {
//
//    @PostMapping("/ratings")
//    public Rating createRating(Rating values);
//
//    @PutMapping("/rating/{ratingId}")
//    public Rating updateRating(@PathVariable("ratingId") String ratingId, Rating rating);
//
//
//}
