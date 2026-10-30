package tn.esprit.autoloc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
