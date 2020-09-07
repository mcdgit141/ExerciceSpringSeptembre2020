package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.Adresse;
import org.springframework.stereotype.Component;

@Component
public class AdresseDTOMapper {

    public AdresseDTOMapper() {
    }

    public Adresse expoToDomain (final AdresseDTO adresseDTO)
    {
        return new Adresse(adresseDTO.numero, adresseDTO.rue, adresseDTO.ville, adresseDTO.codePostal);
    }

    public  AdresseDTO domainToExpo(final Adresse adresse){
        return new AdresseDTO(adresse.getNumero(), adresse.getRue(), adresse.getVille(), adresse.getCodePostal());
    }
}
