/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.service;

import ciclo3.reto3.model.Room;
import ciclo3.reto3.repository.RoomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julia
 */

@Service
public class RoomService {
    
    @Autowired
    private RoomRepository RoomRepository;
    
    public List<Room> getAll(){
        return RoomRepository.getAll();
    }

    public Optional<Room> getRoom(int id){
        return RoomRepository.getRoom(id);
    }

    public Room save(Room r){
        if(r.getId()==null){
            return RoomRepository.save(r);
        }else{
            Optional<Room> raux=RoomRepository.getRoom(r.getId());
            if(raux.isEmpty()){
                return RoomRepository.save(r);
            }else{
                return r;
            }
        }
    }
    
}
