package com.soham.petclinicspringboot.services.map;

import com.soham.petclinicspringboot.model.Owner;
import com.soham.petclinicspringboot.services.CrudService;
import com.soham.petclinicspringboot.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long>, OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return map.entrySet().stream()
                .filter(longOwnerEntry -> longOwnerEntry.getValue().getLastName().equals(lastName))
                .map(Map.Entry::getValue)
                .findFirst().orElse(null);
    }
}
