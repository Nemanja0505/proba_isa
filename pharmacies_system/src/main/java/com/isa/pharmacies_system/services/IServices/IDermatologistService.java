package com.isa.pharmacies_system.services.IServices;

import com.isa.pharmacies_system.domain.user.Dermatologist;

import java.util.Collection;

public interface IDermatologistService {

    Collection<Dermatologist> findAll();
}
