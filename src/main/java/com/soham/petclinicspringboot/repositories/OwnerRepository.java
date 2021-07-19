package com.soham.petclinicspringboot.repositories;

import com.soham.petclinicspringboot.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}
