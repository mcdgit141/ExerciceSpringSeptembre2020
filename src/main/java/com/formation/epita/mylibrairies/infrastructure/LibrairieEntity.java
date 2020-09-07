package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Adresse;
import com.formation.epita.mylibrairies.domain.Directeur;
import com.formation.epita.mylibrairies.domain.TypeLibrairie;

import javax.persistence.*;
import java.util.List;

@Entity
public class LibrairieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeLibrairie typeLibrairie;

    @OneToOne(cascade = CascadeType.PERSIST,orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private AdresseEntity adresseEntity;

    @OneToOne(cascade = CascadeType.PERSIST,orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private DirecteurEntity directeurEntity;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private List<LivresEntity> livresList;

    public LibrairieEntity() {
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

    public AdresseEntity getAdresseEntity() {
        return adresseEntity;
    }

    public void setAdresseEntity(AdresseEntity adresseEntity) {
        this.adresseEntity = adresseEntity;
    }

    public DirecteurEntity getDirecteurEntity() {
        return directeurEntity;
    }

    public void setDirecteurEntity(DirecteurEntity directeurEntity) {
        this.directeurEntity = directeurEntity;
    }

    public List<LivresEntity> getLivresList() {
        return livresList;
    }

    public void setLivresList(List<LivresEntity> livresList) {
        this.livresList = livresList;
    }

  }