package com.soham.petclinicspringboot.bootstrap;

import com.soham.petclinicspringboot.model.Owner;
import com.soham.petclinicspringboot.model.Vet;
import com.soham.petclinicspringboot.services.OwnerService;
import com.soham.petclinicspringboot.services.VetService;
import com.soham.petclinicspringboot.services.map.OwnerServiceMap;
import com.soham.petclinicspringboot.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@ComponentScan(basePackages = {"com.soham.petclinicspringboot"})
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerServiceMap ownerService, VetServiceMap vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1= new Owner();
        owner1.setFirstName("Soham");
        owner1.setLastName("Bhattacharjee");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Boga");
        owner2.setLastName("Haque");

        ownerService.save(owner2);

        Owner owner3= new Owner();
        owner3.setFirstName("Cristiano");
        owner3.setLastName("Ronaldo");

        ownerService.save(owner3);

        System.out.println("Loaded Owners");

        Vet vet1=new Vet();
        vet1.setFirstName("Leo");
        vet1.setLastName("Messi");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Neymar");
        vet2.setLastName("Jr");

        vetService.save(vet2);

        System.out.println("Loaded Vets");

    }
}