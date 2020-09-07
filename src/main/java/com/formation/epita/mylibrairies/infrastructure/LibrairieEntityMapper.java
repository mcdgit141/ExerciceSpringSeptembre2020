package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Librairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibrairieEntityMapper {
    @Autowired
    private AdresseEntityMapper adresseEntityMapper;

    @Autowired
    private DirecteurEntityMapper directeurEntityMapper;
    @Autowired
    private LivresEntityMapper livresEntityMapper;

    public Librairie entityToDomain(LibrairieEntity librairieEntity){

                return new Librairie(librairieEntity.getTypeLibrairie(),adresseEntityMapper.entityToDomain(librairieEntity.getAdresseEntity()),
                directeurEntityMapper.entityToDomain(librairieEntity.getDirecteurEntity()),
                livresEntityMapper.mapToListEntityToDomain(librairieEntity.getLivresList()));
    }

    public List<Librairie> entityToDomainList(final List<LibrairieEntity> librairieEntityList){

       return librairieEntityList.stream().map(e -> entityToDomain(e)).collect(Collectors.toList());
    }

    public LibrairieEntity domainToEntity(Librairie librairie){

            final LibrairieEntity librairieEntity = new LibrairieEntity();
            librairieEntity.setTypeLibrairie(librairie.getTypeLibrairie());
            librairieEntity.setAdresseEntity(adresseEntityMapper.domainToEntity(librairie.getAdresse()));
            librairieEntity.setDirecteurEntity(directeurEntityMapper.domainToEntity(librairie.getDirecteur()));
            librairieEntity.setLivresList(livresEntityMapper.mapToListDomainToEntity(librairie.getLivresList()));
            return librairieEntity;

    }

}
