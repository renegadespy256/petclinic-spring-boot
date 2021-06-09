package com.soham.petclinicspringboot.services;

import com.soham.petclinicspringboot.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet,Long>{

    Vet findByLastName(String lastName);

}
