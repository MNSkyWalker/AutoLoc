package tn.esprit.autoloc.domain.validator;

import org.springframework.stereotype.Component;
import tn.esprit.autoloc.domain.domain.Vehicule;

import java.math.BigDecimal;

@Component
public class VehiculeValidator {

    public void valider(Vehicule vehicule) {
        if (vehicule == null) {
            throw new IllegalArgumentException("Le véhicule ne peut pas être null");
        }
        BigDecimal tarif = vehicule.getTarifJournalier();
        if (tarif == null || tarif.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Le tarif doit être positif");
        }
    }

    public void validerNombreJours(int nombreJours) {
        if (nombreJours <= 0) {
            throw new IllegalArgumentException("Le nombre de jours doit être positif");
        }
    }
}