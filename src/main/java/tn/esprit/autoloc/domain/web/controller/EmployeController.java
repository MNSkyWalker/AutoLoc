package tn.esprit.autoloc.domain.web.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.domain.Employe;
import tn.esprit.autoloc.domain.repository.EmployeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
public class EmployeController {

    private final EmployeRepository employeRepository;

    public EmployeController(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @GetMapping
    public List<Employe> getAll() {
        return employeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employe getById(@PathVariable Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Employe create(@RequestBody Employe employe) {
        return employeRepository.save(employe);
    }
}