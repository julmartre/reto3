/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.service;

import ciclo3.reto3.model.Category;
import ciclo3.reto3.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julia
 */
@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository CategoryRepository;
    
    public List<Category> getAll(){
        return CategoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id){
        return CategoryRepository.getCategory(id);
    }

    public Category save(Category c){
        if(c.getId()==null){
            return CategoryRepository.save(c);
        }else{
            Optional<Category> caux=CategoryRepository.getCategory(c.getId());
            if(caux.isEmpty()){
                return CategoryRepository.save(c);
            }else{
                return c;
            }
        }
    }
}
