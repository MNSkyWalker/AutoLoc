package tn.esprit.autoloc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.domain.Employe;

public interface EquipementRepository extends JpaRepository<Employe,Long> {
}
