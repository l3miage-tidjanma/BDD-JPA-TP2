package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "ClubSportif")
public class ClubSportifEntity {
    @Id
    private Long id;

    private String nom;

    private String description;

    @ManyToMany
    private Set<EtudiantEntity> etudiantEntities;    // APourEtudiant(s)
}
