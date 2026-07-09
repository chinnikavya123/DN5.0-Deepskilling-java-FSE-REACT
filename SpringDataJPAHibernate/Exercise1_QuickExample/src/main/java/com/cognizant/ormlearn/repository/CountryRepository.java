package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for Country entity
public interface CountryRepository
        extends JpaRepository<Country, String> {
}

/*
 * Learned:
 * - Extended JpaRepository to perform database operations.
 * - Spring Data JPA provides CRUD methods automatically.
 * - No need to write SQL for basic operations.
 */
