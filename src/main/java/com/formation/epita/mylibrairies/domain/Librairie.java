package com.formation.epita.mylibrairies.domain;

import com.formation.epita.mylibrairies.infrastructure.AdresseEntity;
import com.formation.epita.mylibrairies.infrastructure.DirecteurEntity;

import java.util.List;

public class Librairie {

    private Long id;
    private TypeLibrairie typeLibrairie;

    private Adresse adresse;

    private Directeur directeur;

    private List<Livres> livresList;

    public Librairie() {
    }

    public Librairie(TypeLibrairie typeLibrairie, Adresse adresse, Directeur directeur, List<Livres> livresList) {
        this.typeLibrairie = typeLibrairie;
        this.adresse = adresse;
        this.directeur=directeur;
        this.livresList = livresList;

    }

    public TypeLibrairie getTypeLibrairie() {
        return typeLibrairie;
    }

    public void setTypeLibrairie(TypeLibrairie typeLibrairie) {
        this.typeLibrairie = typeLibrairie;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Directeur getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Directeur directeur) {
        this.directeur = directeur;
    }

    public List<Livres> getLivresList() {
        return livresList;
    }

    public void setLivresList(List<Livres> livresList) {
        this.livresList = livresList;
    }

    public void miseajour(Librairie librairieNewInfo) {
        this.typeLibrairie = librairieNewInfo.getTypeLibrairie();
        this.adresse = librairieNewInfo.getAdresse();
        this.directeur = librairieNewInfo.getDirecteur();
    }

    public Long getId() {
        return id;
    }
}
