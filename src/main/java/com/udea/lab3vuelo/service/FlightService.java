package com.udea.lab3vuelo.service;

import com.udea.lab3vuelo.dao.IFlightDAO;
import com.udea.lab3vuelo.exception.ModelNotFoundException;
import com.udea.lab3vuelo.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class FlightService {

    @Autowired private IFlightDAO dao;

    public Flight save(Flight flight) {
        return dao.save(flight);
    }

    public String delete(Long id) {
        dao.deleteById(id);
        return "Flight deleted";
    }

    public Iterable<Flight> list() {
        return dao.findAll();
    }

    public Optional<Flight> findById(Long id) {
        return dao.findById(id);
    }


    public Flight update(Flight flight) {
        Flight existingFlight = dao.findById(flight.getIdFlight()).orElse(null);
        existingFlight.setNombreAvion(flight.getNombreAvion());
        existingFlight.setNumeroVuelo(flight.getNumeroVuelo());
        existingFlight.setOrigen(flight.getOrigen());
        existingFlight.setDestino(flight.getDestino());
        existingFlight.setRating(flight.getRating());
        existingFlight.setPlanvuelo(flight.getPlanvuelo());
        existingFlight.setCapacidad(flight.getCapacidad());
        existingFlight.setCumplido(flight.getCumplido());
        return dao.save(existingFlight);
    }

    public List<Flight> viewBestFlight() throws ModelNotFoundException {
        List<Flight> flights = dao.viewBestFlight();
        if(flights.size()>0)
            return flights;
        else throw new ModelNotFoundException("No flight found ");
    }



}