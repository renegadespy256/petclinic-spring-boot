package com.soham.petclinicspringboot.services.map;

import com.soham.petclinicspringboot.model.BaseEntity;
import com.soham.petclinicspringboot.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long,T> map = new HashMap<>();

    protected Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    protected T findById(ID id){
        return map.get(id);
    }

    protected T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }
        return object;
    }

    protected void delete(T object){
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    protected void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextId(){
        Long nextId=null;
        try{
            nextId=Collections.max(map.keySet())+1;
        }catch (NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }
}
