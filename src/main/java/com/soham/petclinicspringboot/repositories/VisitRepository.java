package com.soham.petclinicspringboot.repositories;

import com.soham.petclinicspringboot.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
