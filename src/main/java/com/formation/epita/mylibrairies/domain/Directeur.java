package com.formation.epita.mylibrairies.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Directeur {

    private String prenom;
    private String nom;

    public Directeur() {
    }

    public Directeur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
