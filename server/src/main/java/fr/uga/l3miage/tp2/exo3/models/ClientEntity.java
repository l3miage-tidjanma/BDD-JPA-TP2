package fr.uga.l3miage.tp2.exo3.models;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.OneToOne;

public class ClientEntity {

    @Id
    private long id ;

    private String nom ;

    private String email ;

    @OneToMany(mappedBy = "client")
    private List<CommandeEntity> commandes;

    @OneToOne
    private AdresseEntity adresse;

}