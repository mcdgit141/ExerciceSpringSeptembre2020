package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.Librairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibrairieDTOMapper {

    @Autowired
    AdresseDTOMapper adresseDTOMapper;

    @Autowired
    DirecteurDTOMapper directeurDTOMapper;

    @Autowired
    LivresDTOMapper livresDTOMapper;

    public LibrairieDTOMapper() {
    }

    public Librairie expoToDomain(LibrairieDTO librairieDTO) {

        return new Librairie(librairieDTO.typeLibrairie, adresseDTOMapper.expoToDomain(librairieDTO.adresseDTO),
                directeurDTOMapper.expoToDomain(librairieDTO.directeurDTO),
                livresDTOMapper.mapToListDomain(librairieDTO.getLivresDTOList()));
    }

    public LibrairieDTO domainToExpo(Librairie librairie) {
        return new LibrairieDTO(librairie.getTypeLibrairie(), adresseDTOMapper.domainToExpo(librairie.getAdresse()),
                directeurDTOMapper.domainToExpo(librairie.getDirecteur()),
                livresDTOMapper.mapToListDTO(librairie.getLivresList()));
    }
}
