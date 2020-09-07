package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.Livres;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LivresDTOMapper {

    public Livres expoToDomain(final LivresDTO livresDTO)
    {
        return new Livres(livresDTO.titre, livresDTO.auteur, livresDTO.nombreDePages, livresDTO.genreLitteraire);
    }

    public LivresDTO domainToExpo(final Livres livres)
    {
        return new LivresDTO(livres.getTitre(), livres.getAuteur(), livres.getNombreDePages(), livres.getGenreLitteraire());
    }

    public LivresDTOMapper() {
    }

    public List<Livres> mapToListDomain(final List<LivresDTO> livresDTOList){

        return livresDTOList.stream().map(e -> expoToDomain(e)
        ).collect(Collectors.toList());
    }

    public List<LivresDTO> mapToListDTO(final List<Livres> livresList){
        return livresList.stream().map(e -> domainToExpo(e)).collect(Collectors.toList());
    }
}
