package com.handball.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handball.demo.Model.Teams;

public interface TeamRepository extends JpaRepository<Teams,Integer>{

}
