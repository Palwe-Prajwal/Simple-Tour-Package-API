package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tour;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long>{

}
