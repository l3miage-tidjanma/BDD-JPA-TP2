package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Manager")
public class ManagerEntity extends EmployeEntity {
    private String niveauGestion;
}