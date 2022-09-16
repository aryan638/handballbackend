package com.handball.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handball.demo.Model.Referee;

public interface RefereeRepository extends JpaRepository<Referee, Integer> {

}
