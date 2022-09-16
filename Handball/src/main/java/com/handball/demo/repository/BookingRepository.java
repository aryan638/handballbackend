package com.handball.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handball.demo.Model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
