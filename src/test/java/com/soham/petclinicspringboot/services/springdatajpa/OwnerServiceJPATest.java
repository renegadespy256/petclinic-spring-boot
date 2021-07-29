package com.soham.petclinicspringboot.services.springdatajpa;

import com.soham.petclinicspringboot.model.Owner;
import com.soham.petclinicspringboot.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class OwnerServiceJPATest {

    OwnerServiceJPA ownerServiceJPA;
    private final String firstName = "Boga";
    private final String lastName = "Haque";

    @Mock
    OwnerRepository ownerRepository;

    private Owner returnOwner;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        ownerServiceJPA= new OwnerServiceJPA(ownerRepository);

        returnOwner = new Owner();
        returnOwner.setId(1l);
        returnOwner.setLastName(lastName);
        returnOwner.setFirstName(firstName);
        //System.out.println("Return Owner Set Up");
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerSet.add(returnOwner);

        Mockito.when(ownerRepository.findAll()).thenReturn(ownerSet);

        assertEquals(1,ownerServiceJPA.findAll().size());
    }

    @Test
    void findById() {
        Optional<Owner> optionalOwner = Optional.of(returnOwner);
        Mockito.when(ownerRepository.findById(Mockito.any())).thenReturn(optionalOwner);
        assertEquals(lastName,ownerServiceJPA.findById(1l).getLastName());
    }

    @Test
    void save() {
        Mockito.when(ownerRepository.save(returnOwner)).thenReturn(returnOwner);
        assertEquals(returnOwner,ownerServiceJPA.save(returnOwner));
    }

    @Test
    void delete() {
        ownerServiceJPA.delete(returnOwner);
        Mockito.verify(ownerRepository).delete(Mockito.any());
    }

    @Test
    void deleteById() {
        ownerServiceJPA.deleteById(1l);
        Mockito.verify(ownerRepository).deleteById(any());
    }

    @Test
    void findByLastName() {

        //System.out.println("inside test");
        Mockito.when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner s = ownerServiceJPA.findByLastName(lastName);

        assertEquals(firstName,s.getFirstName());
    }
}