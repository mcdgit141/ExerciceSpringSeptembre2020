package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Adresse;
import com.formation.epita.mylibrairies.domain.Livres;
import com.formation.epita.mylibrairies.exposition.LivresDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LivresEntityMapper {

    public Livres entityToDomain(final LivresEntity livresEntity) {
        return new Livres(livresEntity.getTitre(),livresEntity.getAuteur(), livresEntity.getNombreDePages(), livresEntity.getGenreLitteraire());
    }

    public LivresEntity domainToEntity(final Livres livres) {
        final LivresEntity livresEntity = new LivresEntity();
        livresEntity.setAuteur(livresEntity.getAuteur());
        livresEntity.setGenreLitteraire(livres.getGenreLitteraire());
        livresEntity.setNombreDePages(livres.getNombreDePages());
        livresEntity.setTitre(livres.getTitre());
        livresEntity.setPrix(100);
        return livresEntity;
    }

    public List<Livres> mapToListEntityToDomain(final List<LivresEntity> livresEntityList){

        return livresEntityList.stream().map(e -> entityToDomain(e)
        ).collect(Collectors.toList());
    }

    public List<LivresEntity> mapToListDomainToEntity(final List<Livres> livresList){
        return livresList.stream().map(e -> domainToEntity(e)).collect(Collectors.toList());
    }
}
