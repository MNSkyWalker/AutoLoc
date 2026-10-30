package tn.esprit.autoloc.domain.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.domain.Vehicule;
import tn.esprit.autoloc.domain.repository.VehiculeRepository;
import tn.esprit.autoloc.domain.service.JournalisationService;
import tn.esprit.autoloc.domain.validator.VehiculeValidator;

@Service
public class VehiculeService {

    private final VehiculeRepository repository;
    private final VehiculeValidator validator;
    private final JournalisationService journal;

    public VehiculeService(VehiculeRepository repository,
                           VehiculeValidator validator,
                           JournalisationService journal) {
        this.repository = repository;
        this.validator = validator;
        this.journal = journal;
    }

    public Vehicule ajouter(Vehicule vehicule) {
        validator.valider(vehicule);
        Vehicule saved = repository.save(vehicule);
        journal.info("Véhicule ajouté : " + saved.getImmatriculation());
        return saved;
    }

    public Vehicule consulter(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Véhicule introuvable : " + id));
    }
    // modifier / supprimer / lister : conservez ce que vous avez déjà
}