package com.isa.pharmacies_system.services;

import com.isa.pharmacies_system.domain.user.Dermatologist;
import com.isa.pharmacies_system.repositories.IDermatologistRepository;
import com.isa.pharmacies_system.services.IServices.IDermatologistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DermatologistService implements IDermatologistService {

    private IDermatologistRepository dermatologistRepository;

    @Autowired
    public DermatologistService(IDermatologistRepository dermatologistRepository) {
        this.dermatologistRepository = dermatologistRepository;
    }

    public Collection<Dermatologist> findAll(){
        return dermatologistRepository.findAll();
    }
}
