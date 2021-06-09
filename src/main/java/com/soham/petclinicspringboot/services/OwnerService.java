package com.soham.petclinicspringboot.services;

import com.soham.petclinicspringboot.model.Owner;

import java.util.Set;

public interface OwnerService  extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
