package tn.esprit.autoloc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
