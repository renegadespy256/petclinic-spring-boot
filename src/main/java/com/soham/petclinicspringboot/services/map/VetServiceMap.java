package com.soham.petclinicspringboot.services.map;

import com.soham.petclinicspringboot.model.Vet;
import com.soham.petclinicspringboot.services.CrudService;
import com.soham.petclinicspringboot.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long>, VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return map.entrySet().stream()
                .filter(longOwnerEntry -> longOwnerEntry.getValue().getLastName().equals(lastName))
                .map(Map.Entry::getValue)
                .findFirst().orElse(null);
    }
}
