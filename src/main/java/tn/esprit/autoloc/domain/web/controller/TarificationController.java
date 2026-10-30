package tn.esprit.autoloc.domain.web.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.domain.Vehicule;
import tn.esprit.autoloc.domain.service.TarificationService;
import tn.esprit.autoloc.domain.service.VehiculeService;

import java.util.Map;

@RestController
@RequestMapping("/api/tarification")
public class TarificationController {

    private final TarificationService tarificationService;
    private final VehiculeService vehiculeService;

    public TarificationController(TarificationService t, VehiculeService v) {
        this.tarificationService = t; this.vehiculeService = v;
    }

    @GetMapping("/{idVehicule}")
    public Map<String, Object> calculer(@PathVariable Long idVehicule,
                                        @RequestParam int jours,
                                        @RequestParam(defaultValue = "STANDARD") String type) {
        Vehicule v = vehiculeService.consulter(idVehicule);
        return Map.of("type", type.toUpperCase(), "jours", jours,
                "prix", tarificationService.calculerPrix(v, jours, type));
    }
}