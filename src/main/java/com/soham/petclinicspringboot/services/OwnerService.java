package com.soham.petclinicspringboot.services;

import com.soham.petclinicspringboot.model.Owner;

public interface OwnerService  extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
