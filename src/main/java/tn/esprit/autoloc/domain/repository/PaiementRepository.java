package tn.esprit.autoloc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
