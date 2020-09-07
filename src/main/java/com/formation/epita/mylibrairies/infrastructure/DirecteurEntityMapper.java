package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Adresse;
import com.formation.epita.mylibrairies.domain.Directeur;
import org.springframework.stereotype.Component;

@Component
public class DirecteurEntityMapper {

    public Directeur entityToDomain(final DirecteurEntity directeurEntity) {
        return new Directeur(directeurEntity.getNom(),directeurEntity.getPrenom());
    }


    public DirecteurEntity domainToEntity(final Directeur directeur) {
        final DirecteurEntity directeurEntity = new DirecteurEntity();
        directeurEntity.setNom(directeur.getNom());
        directeurEntity.setPrenom(directeur.getPrenom());
        return directeurEntity;
    }
}
