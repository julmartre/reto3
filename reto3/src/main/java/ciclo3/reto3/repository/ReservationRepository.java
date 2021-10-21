/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.repository;

import ciclo3.reto3.model.Reservation;
import ciclo3.reto3.repositorycrud.ReservationCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author julia
 */

@Repository
public class ReservationRepository {
        @Autowired
    private ReservationCrudRepository ReservationCrudRepository;
    
        public List<Reservation> getAll(){
        return (List<Reservation>) ReservationCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return  ReservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation r){
        return ReservationCrudRepository.save(r);
    }
    
}
