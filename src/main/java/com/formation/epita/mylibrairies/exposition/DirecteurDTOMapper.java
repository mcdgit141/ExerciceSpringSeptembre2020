package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.Directeur;
import org.springframework.stereotype.Component;

@Component
public class DirecteurDTOMapper {

    public DirecteurDTOMapper() {
    }

    public Directeur expoToDomain(final DirecteurDTO directeurDTO){
        return new Directeur(directeurDTO.prenom, directeurDTO.nom);
    }

    public DirecteurDTO domainToExpo(final Directeur directeur){
        return new DirecteurDTO(directeur.getPrenom(), directeur.getNom());
    }
}
