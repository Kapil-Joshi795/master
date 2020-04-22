package com.flights.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flights.api.model.Flights;

@Repository
public interface FlightRepository extends JpaRepository<Flights, Long>{

}
