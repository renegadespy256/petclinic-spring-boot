package com.soham.petclinicspringboot.bootstrap;

import com.soham.petclinicspringboot.model.Owner;
import com.soham.petclinicspringboot.model.PetType;
import com.soham.petclinicspringboot.model.Vet;
import com.soham.petclinicspringboot.services.OwnerService;
import com.soham.petclinicspringboot.services.PetTypeService;
import com.soham.petclinicspringboot.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.soham.petclinicspringboot"})
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setName("Dog");

        PetType savedDog = petTypeService.save(dog);

        PetType cat=new PetType();
        dog.setName("cat");

        PetType savedCat = petTypeService.save(cat);

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
