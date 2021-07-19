package com.soham.petclinicspringboot.repositories;

import com.soham.petclinicspringboot.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
