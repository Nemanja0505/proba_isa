package com.isa.pharmacies_system.controllers;

import com.isa.pharmacies_system.domain.user.Dermatologist;
import com.isa.pharmacies_system.services.IServices.IDermatologistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("api/dermatologist")
public class DermatologistController {

    private IDermatologistService dermatologistService;

    @Autowired
    public DermatologistController(IDermatologistService dermatologistService) {
        this.dermatologistService = dermatologistService;
    }

    @GetMapping("/")
    public ResponseEntity<Collection<Dermatologist>> findAll(){
        return new ResponseEntity<>(dermatologistService.findAll(), HttpStatus.OK);
    }
}
