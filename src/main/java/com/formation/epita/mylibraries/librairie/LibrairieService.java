package com.formation.epita.mylibraries.librairie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LibrairieService implements ILibrairieService{

    @Autowired
    LibrairieDao librairieDao;

    public void create (Librairie librairie) {
        librairieDao.save(librairie);
    }

    @Override
    public Librairie findByid(Long id) {
        return this.librairieDao.findById(id).orElseThrow(() -> new RuntimeException("LIBRARY NOT FOUND"));
    }

}
