package org.example.tarea2_20211688_20216256.Repository;

import org.example.tarea2_20211688_20216256.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {
}
