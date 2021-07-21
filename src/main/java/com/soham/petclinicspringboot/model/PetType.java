package com.soham.petclinicspringboot.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "pet_type")
public class PetType extends BaseEntity{

    private String name;
}
