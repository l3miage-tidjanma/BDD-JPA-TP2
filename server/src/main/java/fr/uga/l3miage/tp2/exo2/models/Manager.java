package main.java.fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Entity;

@Entity
public class Manager extends Employe {
    private String niveauGestion;
}