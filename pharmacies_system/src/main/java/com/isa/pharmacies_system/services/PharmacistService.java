package com.isa.pharmacies_system.services;

import com.isa.pharmacies_system.domain.user.Pharmacist;
import com.isa.pharmacies_system.repositories.IPharmacistRepository;
import com.isa.pharmacies_system.services.IServices.IPharmacistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PharmacistService implements IPharmacistService {

    private IPharmacistRepository pharmacistRepository;

    @Autowired
    public PharmacistService(IPharmacistRepository pharmacistRepository) {
        this.pharmacistRepository = pharmacistRepository;
    }

    @Override
    public Collection<Pharmacist> findAll() {
        return pharmacistRepository.findAll();
    }
}
