package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.Livres;
import com.formation.epita.mylibrairies.domain.TypeLibrairie;
import com.sun.istack.NotNull;

import java.util.Collections;
import java.util.List;

public class LibrairieDTO {

    final TypeLibrairie typeLibrairie;

    final AdresseDTO adresseDTO;

    final DirecteurDTO directeurDTO;

    final List<LivresDTO> livresDTOList;

       public LibrairieDTO(TypeLibrairie typeLibrairie, AdresseDTO adresseDTO, DirecteurDTO directeurDTO, List<LivresDTO> livresDTOList) {
        this.typeLibrairie = typeLibrairie;
        this.adresseDTO = adresseDTO;
        this.directeurDTO = directeurDTO;
        this.livresDTOList = Collections.unmodifiableList(livresDTOList);
    }

    public TypeLibrairie getTypeLibrairie() {
        return typeLibrairie;
    }

    public AdresseDTO getAdresseDTO() {
        return adresseDTO;
    }

    public DirecteurDTO getDirecteurDTO() {
        return directeurDTO;
    }

    public List<LivresDTO> getLivresDTOList() {
        return livresDTOList;
    }
}
