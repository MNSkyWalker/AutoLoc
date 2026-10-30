package tn.esprit.autoloc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
