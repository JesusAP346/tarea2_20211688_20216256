package org.example.tarea2_20211688_20216256.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="location_id",nullable=false)
    private Integer id;

    private String  city;


}
