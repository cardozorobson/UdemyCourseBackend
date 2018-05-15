/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robson.ionicsp.SpringIonic.controller;

import com.robson.ionicsp.SpringIonic.entity.Categoria;
import com.robson.ionicsp.SpringIonic.service.CatergoriaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author robsoncardozo
 */
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CatergoriaService catergoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Categoria categoria = catergoriaService.buscar(id);

        return ResponseEntity.ok().body(categoria);
    }
}
