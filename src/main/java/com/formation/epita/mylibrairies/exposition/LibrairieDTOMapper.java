package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.Librairie;
import com.formation.epita.mylibrairies.domain.Livres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibrairieDTOMapper {

    @Autowired
    static
     AdresseDTOMapper adresseDTOMapper;

    @Autowired
    static
    DirecteurDTOMapper directeurDTOMapper;

    @Autowired
    static
    LivresDTOMapper livresDTOMapper;

    public LibrairieDTOMapper() {
            }

        public static Librairie expoToDomain(LibrairieDTO librairieDTO){

        return new Librairie(librairieDTO.typeLibrairie,adresseDTOMapper.expoToDomain(librairieDTO.adresseDTO),
                             directeurDTOMapper.expoToDomain(librairieDTO.directeurDTO),
                            livresDTOMapper.mapToListDomain(librairieDTO.getLivresDTOList()));
    }

        public static LibrairieDTO domainToExpo(Librairie librairie){
        return new LibrairieDTO(librairie.getTypeLibrairie(),adresseDTOMapper.domainToExpo(librairie.getAdresse()),
                                directeurDTOMapper.domainToExpo(librairie.getDirecteur()),
                                livresDTOMapper.mapToListDTO(librairie.getLivresList()));
        }

}
