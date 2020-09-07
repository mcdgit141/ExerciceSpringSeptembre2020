package com.formation.epita.mylibrairies.domain;

import javax.persistence.*;

public class Livres {

    private String titre;
    private String auteur;
    private Integer nombreDePages;

    private GenreLitteraire genreLitteraire;

    public Livres( String titre, String auteur, Integer nombreDePages, GenreLitteraire genreLitteraire) {

        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.genreLitteraire = genreLitteraire;
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
}
