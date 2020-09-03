package com.formation.epita.mylibraries.librairie;

import javax.persistence.*;

@Entity
public class Librairie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeLibrairie typeLibrairie;
    @Embedded
    private Adresse adresse;
    @Embedded
    private Directeur directeur;

    public Librairie() {
    }

    public Librairie(Long id, TypeLibrairie typeLibrairie, Adresse adresse, Directeur directeur) {
        this.id = id;
        this.typeLibrairie = typeLibrairie;
        this.adresse = adresse;
        this.directeur = directeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
