package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Developpeur")
public class DeveloppeurEntity extends EmployeEntity {
    private String langagePrefere;

    private String niveauCompetence;
}
