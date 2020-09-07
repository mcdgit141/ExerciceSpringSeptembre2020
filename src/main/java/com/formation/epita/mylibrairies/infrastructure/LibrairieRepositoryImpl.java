package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Librairie;
import com.formation.epita.mylibrairies.domain.LibrairieRepository;
import com.formation.epita.mylibrairies.domain.TypeLibrairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibrairieRepositoryImpl implements LibrairieRepository {

    @Autowired
    private LibrairieDao librairieDao;

    @Autowired
    static
    LibrairieEntityMapper librairieEntityMapper;

    @Override
//    public void enregistrerLibrairie(Librairie librairie) {
//        librairieDao.save(librairie);
//    }
    public void enregistrerLibrairie(Librairie librairie) {

       librairieDao.save(LibrairieEntityMapper.domainToEntity(librairie));

    }

    @Override
    public Optional<Librairie> rechercheLibrairieId(Long id) {

        Optional<LibrairieEntity> librairieEntity = librairieDao.findById(id);
//        LibrairieEntity librairieEntity1 = librairieEntity.orElseThrow(() -> new RuntimeException("librairie non trouvée"));
//        Librairie librairie = librairieEntityMapper.entityToDomain(librairieEntity.get());
//        Optional<Librairie> librairieOptional = Optional.of(librairie);

        return Optional.of(librairieEntityMapper.entityToDomain(librairieEntity.orElseThrow(() -> new RuntimeException("librairie non trouvée"))));

    }

    @Override
    public List<Librairie> rechercheTouteLibrairie() {

        List<LibrairieEntity> librairieEntityList = librairieDao.findAll();
        return librairieEntityMapper.entityToDomainList(librairieEntityList);

//        return librairieDao.findAll();

    }

    @Override
    public List<Librairie> rechercheTypeLibrairie(TypeLibrairie type) {
        List<LibrairieEntity> librairieEntityList = librairieDao.findByTypeLibrairie(type);
        return librairieEntityMapper.entityToDomainList(librairieEntityList);

//        return librairieDao.findByTypeLibrairie(type);
    }

    @Override
    public List<Librairie> rechercheLibrairieByDirecteurPrenom(String prenom) {

        List<LibrairieEntity> librairieEntityList = librairieDao.findByDirecteurPrenom(prenom);
        return librairieEntityMapper.entityToDomainList(librairieEntityList);

//        return librairieDao.findByDirecteurPrenom(prenom);
    }

    @Override
    public void suppressionLibrairie(Librairie librairie) {

        Optional<LibrairieEntity> librairieEntity = librairieDao.findById(librairie.getId());
        librairieDao.delete(librairieEntityMapper.domainToEntity(librairie));
//        librairieDao.delete(librairie);
    }
}
