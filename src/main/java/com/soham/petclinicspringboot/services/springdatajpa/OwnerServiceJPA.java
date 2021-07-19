package com.soham.petclinicspringboot.services.springdatajpa;

import com.soham.petclinicspringboot.model.Owner;
import com.soham.petclinicspringboot.model.PetType;
import com.soham.petclinicspringboot.repositories.OwnerRepository;
import com.soham.petclinicspringboot.repositories.PetRepository;
import com.soham.petclinicspringboot.repositories.PetTypeRepository;
import com.soham.petclinicspringboot.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerServiceJPA implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerServiceJPA(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet=new HashSet<>();
        ownerRepository.findAll().forEach(ownerSet::add);
        return ownerSet;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).get();
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
