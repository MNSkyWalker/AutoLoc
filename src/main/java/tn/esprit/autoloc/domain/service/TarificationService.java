package tn.esprit.autoloc.domain.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.domain.Vehicule;
import tn.esprit.autoloc.domain.repository.StrategieTarification;
import tn.esprit.autoloc.domain.validator.VehiculeValidator;

import java.util.Map;

@Service
public class TarificationService {

    private final Map<String, StrategieTarification> strategies;
    private final VehiculeValidator validator;

    public TarificationService(Map<String, StrategieTarification> strategies,
                               VehiculeValidator validator) {
        this.strategies = strategies;
        this.validator = validator;
    }

    public double calculerPrix(Vehicule vehicule, int jours, String type) {
        validator.validerNombreJours(jours);

        StrategieTarification strategie =
                (type == null) ? null : strategies.get(type.toUpperCase());

        if (strategie == null) {
            throw new IllegalArgumentException(
                    "Type de tarif inconnu : " + type + ". Types disponibles : " + strategies.keySet());
        }
        return strategie.calculer(vehicule.getTarifJournalier().doubleValue(), jours);
    }
}