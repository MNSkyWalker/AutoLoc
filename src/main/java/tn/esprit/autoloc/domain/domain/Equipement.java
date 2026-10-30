package tn.esprit.autoloc.domain.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "equipement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    @Column(nullable = false, length = 50)
    private String libelle;

    // ManyToMany : un équipement peut être utilisé dans plusieurs réservations
    @ManyToMany(mappedBy = "equipements")
    private List<Reservation> reservations = new ArrayList<>();
}