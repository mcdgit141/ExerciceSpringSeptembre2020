package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Adresse;
import org.springframework.stereotype.Component;

@Component
public class AdresseEntityMapper {

   public Adresse entityToDomain(final AdresseEntity adresseEntity) {
        return new Adresse(adresseEntity.getNumero(), adresseEntity.getRue(), adresseEntity.getVille(), adresseEntity.getCodePostal());
    }

    public AdresseEntity domainToEntity(final Adresse adresse) {
        final AdresseEntity adresseEntity = new AdresseEntity();
        adresseEntity.setRue(adresse.getRue());
        adresseEntity.setNumero(adresse.getNumero());
        adresseEntity.setVille(adresse.getVille());
        adresseEntity.setCodePostal(adresse.getCodePostal());
        return adresseEntity;
    }
}
