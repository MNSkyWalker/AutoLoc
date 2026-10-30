package tn.esprit.autoloc.domain.web.controller;

public class VehiculeIntrouvableException extends RuntimeException {
    public VehiculeIntrouvableException(Long id) {
        super("Véhicule introuvable : " + id);
    }
}