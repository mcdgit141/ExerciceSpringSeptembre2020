package com.formation.epita.mylibrairies.exposition;

import org.springframework.stereotype.Component;


public class DirecteurDTO {

    final String prenom;
    final String nom;

    public DirecteurDTO(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
