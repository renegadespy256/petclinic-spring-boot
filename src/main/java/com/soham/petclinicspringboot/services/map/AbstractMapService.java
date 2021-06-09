package com.soham.petclinicspringboot.services.map;

import com.soham.petclinicspringboot.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T,ID> {

    protected Map<ID,T> map = new HashMap<>();

    protected Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    protected T findById(ID id){
        return map.get(id);
    }

    protected T save(ID id, T object){
        map.put(id,object);
        return object;
    }

    protected void delete(T object){
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    protected void deleteById(ID id){
        map.remove(id);
    }
}
