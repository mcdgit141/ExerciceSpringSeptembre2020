package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.GenreLitteraire;

import javax.persistence.*;

@Entity
public class LivresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long livreId;

    private String titre;
    private String auteur;
    private Integer nombreDePages;

    @Enumerated(EnumType.STRING)
    private GenreLitteraire genreLitteraire;

    private int prix;

    public LivresEntity() {

    }

    public Long getBookId() {
        return livreId;
    }

    public void setBookId(Long bookId) {
        this.livreId = bookId;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Integer getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(Integer nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public GenreLitteraire getGenreLitteraire() {
        return genreLitteraire;
    }

    public void setGenreLitteraire(GenreLitteraire genreLitteraire) {
        this.genreLitteraire = genreLitteraire;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
