package com.soham.petclinicspringboot.repositories;

import com.soham.petclinicspringboot.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
