package tn.esprit.autoloc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
