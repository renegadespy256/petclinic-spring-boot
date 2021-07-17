package com.soham.petclinicspringboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pet_type")
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
