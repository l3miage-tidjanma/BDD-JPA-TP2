package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "developer_miage")
public class DeveloperMiageEntity {
    @Id
    @Column
    private String lastname;
    @Column
    private String firstname;
    @Column
    private String email;

    @ManyToMany(mappedBy = "developers")
    private Set<ProjetEntity> projets;  // APourProjet(s)
}
