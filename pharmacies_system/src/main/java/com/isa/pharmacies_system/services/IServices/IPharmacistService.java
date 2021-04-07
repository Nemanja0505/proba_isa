package com.isa.pharmacies_system.services.IServices;

import com.isa.pharmacies_system.domain.user.Pharmacist;

import java.util.Collection;

public interface IPharmacistService {

    Collection<Pharmacist> findAll();
}
