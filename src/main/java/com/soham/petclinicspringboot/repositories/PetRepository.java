package com.soham.petclinicspringboot.repositories;

import com.soham.petclinicspringboot.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
