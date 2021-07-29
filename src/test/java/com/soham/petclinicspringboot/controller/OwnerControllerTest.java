package com.soham.petclinicspringboot.controller;

import com.soham.petclinicspringboot.model.Owner;
import com.soham.petclinicspringboot.services.OwnerService;
import com.soham.petclinicspringboot.services.springdatajpa.OwnerServiceJPA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @InjectMocks
    OwnerController ownerController;

    @Mock
    OwnerService ownerService;

    Set<Owner> ownerSet;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        ownerSet = new HashSet<>();
        Owner owner1 = new Owner();
        owner1.setId(1l);

        Owner owner2 = new Owner();
        owner2.setId(2l);

        ownerSet.add(owner1);
        ownerSet.add(owner2);

        mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    @Test
    void listOwner() throws Exception {

        Mockito.when(ownerService.findAll()).thenReturn(ownerSet);
        mockMvc.perform(MockMvcRequestBuilders.get("/owners")).andExpect(status().isOk());
    }
}