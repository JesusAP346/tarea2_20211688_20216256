package org.example.tarea2_20211688_20216256.Controller;

import org.example.tarea2_20211688_20216256.Entity.Employees;
import org.example.tarea2_20211688_20216256.Entity.Job;
import org.example.tarea2_20211688_20216256.Repository.EmployeeRepository;
import org.example.tarea2_20211688_20216256.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"/employee"},method = RequestMethod.GET)
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private final JobRepository jobRepository;


    public EmployeeController(EmployeeRepository employeeRepository, JobRepository jobRepository) {
        this.employeeRepository = employeeRepository;
        this.jobRepository = jobRepository;

    }

    @GetMapping({"","/list","/"})
    public String listarEmpleados(Model model){
        List<Employees> listaEmployees = employeeRepository.findAll();

        model.addAttribute("listaEmployees",listaEmployees);

        return "employee/lista";
    }

    @GetMapping({"/info"})
    public String mostrarEmployee(Model model, @RequestParam("id") Integer id){
        System.out.println(id);
        Optional<Employees> optEmployee = employeeRepository.findById(id);
        if(optEmployee.isPresent()){
            Employees employee = optEmployee.get();
            List<Job> listaJobs = jobRepository.findAll();

            model.addAttribute("employee", employee);
            model.addAttribute("listaJobs",listaJobs);
            return "employee/info";

        }else{
            return "redirect:/employee";
        }

    }

    @GetMapping({"/eliminar"})
    public String eliminar(Model model, @RequestParam("id") Integer id){
        System.out.println(id);
        Optional<Employees> optEmployee = employeeRepository.findById(id);
        if(optEmployee.isPresent()){
            employeeRepository.deleteById(id);
        }

        return "redirect:/employee";

    }



}
