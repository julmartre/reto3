/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.service;

import ciclo3.reto3.model.Reservation;
import ciclo3.reto3.repository.ReservationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julia
 */

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository ReservationRepository;
    
    public List<Reservation> getAll(){
        return ReservationRepository.getAll();
    }

    public Optional<Reservation> getReservation(int id){
        return ReservationRepository.getReservation(id);
    }

    public Reservation save(Reservation r){
        if(r.getIdReservation()==null){
            return ReservationRepository.save(r);
        }else{
            Optional<Reservation> raux=ReservationRepository.getReservation(r.getIdReservation());
            if(raux.isEmpty()){
                return ReservationRepository.save(r);
            }else{
                return r;
            }
        }
    }
    
}
