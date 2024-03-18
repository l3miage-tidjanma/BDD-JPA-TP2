package fr.uga.l3miage.tp2.exo3.models;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class AdresseEntity {

    @Id
    private long id ;

    private String rue ;
    private String numero ;
    private String codePostal ;
    private String ville ;

    @OneToOne(mappedBy = "adresse")
    private ClientEntity client;

}