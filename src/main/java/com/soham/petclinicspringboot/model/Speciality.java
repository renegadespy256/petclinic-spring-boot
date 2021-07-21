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
@Table(name = "specialities")
public class Speciality extends BaseEntity{

    private String description;
}
