package main.java.fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Entity;

@Entity
public class Developpeur extends Employe {
    private String langagePrefere;

    private String niveauCompetence;
}
