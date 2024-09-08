package org.example.tarea2_20211688_20216256.Repository;

import org.example.tarea2_20211688_20216256.Controller.EmployeeController;
import org.example.tarea2_20211688_20216256.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees,Integer> {

}
