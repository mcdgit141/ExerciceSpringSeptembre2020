package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Librairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibrairieEntityMapper {
    @Autowired
    static
    private AdresseEntityMapper adresseEntityMapper;

    @Autowired
    static
    private DirecteurEntityMapper directeurEntityMapper;
    @Autowired
    static
    private LivresEntityMapper livresEntityMapper;

    public static Librairie entityToDomain(LibrairieEntity librairieEntity){

                return new Librairie(librairieEntity.getTypeLibrairie(),adresseEntityMapper.entityToDomain(librairieEntity.getAdresseEntity()),
                directeurEntityMapper.entityToDomain(librairieEntity.getDirecteurEntity()),
                livresEntityMapper.mapToListEntityToDomain(librairieEntity.getLivresList()));
    }

    public static List<Librairie> entityToDomainList(final List<LibrairieEntity> librairieEntityList){

       return librairieEntityList.stream().map(e -> entityToDomain(e)).collect(Collectors.toList());
    }

    public static LibrairieEntity domainToEntity(Librairie librairie){

            final LibrairieEntity librairieEntity = new LibrairieEntity();
            librairieEntity.setTypeLibrairie(librairie.getTypeLibrairie());
            librairieEntity.setAdresseEntity(adresseEntityMapper.domainToEntity(librairie.getAdresse()));
            librairieEntity.setDirecteurEntity(directeurEntityMapper.domainToEntity(librairie.getDirecteur()));
            librairieEntity.setLivresList(livresEntityMapper.mapToListDomainToEntity(librairie.getLivresList()));
            return librairieEntity;

    }

}
