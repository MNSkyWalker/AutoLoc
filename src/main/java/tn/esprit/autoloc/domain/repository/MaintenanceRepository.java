package tn.esprit.autoloc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.domain.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
