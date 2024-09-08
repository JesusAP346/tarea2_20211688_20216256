package org.example.tarea2_20211688_20216256.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Dempartment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="department_id",nullable = false)
    private Integer id;

    private String department_name;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

}
