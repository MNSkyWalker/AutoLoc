package tn.esprit.autoloc.domain.repository;

import tn.esprit.autoloc.domain.domain.Vehicule;

public interface GestionVehicule {
    Vehicule ajouter(Vehicule vehicule );
    Vehicule consulter(Long id);
    Vehicule modifier(long id, Vehicule vehicule);
    void supprimer(Long id);
    void exporterRapport();
    void envoyerNotification();
}
