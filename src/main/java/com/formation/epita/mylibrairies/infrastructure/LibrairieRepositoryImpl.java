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
    LibrairieDao librairieDao;

    @Override
    public void enregistrerLibrairie(Librairie librairie) {
        librairieDao.save(librairie);
    }

    @Override
    public Optional<Librairie> rechercheLibrairieId(Long id) {
        return librairieDao.findById(id);
    }

    @Override
    public List<Librairie> rechercheTouteLibrairie() {
        return librairieDao.findAll();
    }

    @Override
    public List<Librairie> rechercheTypeLibrairie(TypeLibrairie type) {
        return librairieDao.findByTypeLibrairie(type);
    }

    @Override
    public List<Librairie> rechercheLibrairieByDirecteurPrenom(String prenom) {
        return librairieDao.findByDirecteurPrenom(prenom);
    }

    @Override
    public void suppressionLibrairie(Librairie librairie) {
        librairieDao.delete(librairie);
    }
}
