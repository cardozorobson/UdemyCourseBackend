/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robson.ionicsp.SpringIonic.service;

import com.robson.ionicsp.SpringIonic.Repository.CategoriaRepository;
import com.robson.ionicsp.SpringIonic.entity.Categoria;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author robsoncardozo
 */
@Service
public class CatergoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;
        
    public Categoria buscar(Integer id){
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }
    
    
}
