package org.example.tarea2_20211688_20216256.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employee_id",nullable=false)
    private Integer id;

    private String first_name;
    private String last_name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Dempartment department;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;


}
