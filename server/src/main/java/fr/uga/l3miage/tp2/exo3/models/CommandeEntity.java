package fr.uga.l3miage.tp2.exo3.models;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


public class CommandeEntity {
    @Id
    private long id ;

    private Date date ;

    private double montantTotal ;

    @ManyToOne
    private ClientEntity client;

    @OneToOne
    private ProduitEntity produit;

}