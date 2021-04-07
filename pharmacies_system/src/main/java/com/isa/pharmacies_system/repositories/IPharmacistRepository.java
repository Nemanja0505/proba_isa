package com.isa.pharmacies_system.repositories;

import com.isa.pharmacies_system.domain.user.Pharmacist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPharmacistRepository extends JpaRepository<Pharmacist,Long> {
}
