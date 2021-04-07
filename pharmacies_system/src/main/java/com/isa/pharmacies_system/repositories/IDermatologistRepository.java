package com.isa.pharmacies_system.repositories;

import com.isa.pharmacies_system.domain.user.Dermatologist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDermatologistRepository extends JpaRepository<Dermatologist,Long> {
}
