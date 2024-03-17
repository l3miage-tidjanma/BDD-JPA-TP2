package main.java.fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@MappedSuperclass   // Permet de donner l’indication que la classe mère ne peut jamais être concrète
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employe {
    @Id
    private Long id;

    private String nom;

    private  String email;

    private double salaire;
}