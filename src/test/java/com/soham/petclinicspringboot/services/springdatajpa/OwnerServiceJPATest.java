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
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {

        //System.out.println("inside test");
        Mockito.when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner s = ownerServiceJPA.findByLastName(lastName);

        assertEquals(firstName,s.getFirstName());

        //Mockito.verify(ownerRepository.findByLastName(any()),Mockito.times(1));
    }
}