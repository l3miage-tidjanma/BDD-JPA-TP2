package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Entity
@Table(name = "projet")
public class ProjetEntity {
    @Id
    @Column
    private BigInteger id;
    @Column
    private String name;
    @Column
    private String description;

    @ManyToMany
    private Set<DeveloperMiageEntity> developers;   // APourDeveloppeur(s)
}
