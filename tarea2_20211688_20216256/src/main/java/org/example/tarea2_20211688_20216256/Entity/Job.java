package org.example.tarea2_20211688_20216256.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jobs")
public class Job {
    @Id
    private String job_id;

    private String job_title;

}
