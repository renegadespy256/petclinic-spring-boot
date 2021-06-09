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
        owner1.setId(1L);

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Boga");
        owner2.setLastName("Haque");
        owner2.setId(2l);

        ownerService.save(owner2);

        Owner owner3= new Owner();
        owner1.setFirstName("Cristiano");
        owner1.setLastName("Ronaldo");
        owner1.setId(3l);

        ownerService.save(owner3);

        System.out.println("Loaded Owners");

        Vet vet1=new Vet();
        vet1.setFirstName("Leo");
        vet1.setLastName("Messi");
        vet1.setId(4l);

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Neymar");
        vet2.setLastName("Jr");
        vet2.setId(5l);

        vetService.save(vet2);

        System.out.println("Loaded Vets");


    }
}
