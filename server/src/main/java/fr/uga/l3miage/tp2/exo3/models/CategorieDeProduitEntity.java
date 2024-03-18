package fr.uga.l3miage.tp2.exo3.models;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class CategorieDeProduitEntity {

    @Id
    private long id ;

    private String nom ;


    @OneToMany(mappedBy = "categorie")
    private List<ProduitEntity> produits;
}