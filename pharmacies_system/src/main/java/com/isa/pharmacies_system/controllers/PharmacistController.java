package com.isa.pharmacies_system.controllers;

import com.isa.pharmacies_system.domain.user.Pharmacist;
import com.isa.pharmacies_system.services.IServices.IPharmacistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/api/pharmacist")
public class PharmacistController {

    private IPharmacistService pharmacistService;

    @Autowired
    public PharmacistController(IPharmacistService pharmacistService) {
        this.pharmacistService = pharmacistService;
    }

    @GetMapping("/")
    public ResponseEntity<Collection<Pharmacist>> getAll(){
        return new ResponseEntity<>(pharmacistService.findAll(), HttpStatus.OK);
    }
}
