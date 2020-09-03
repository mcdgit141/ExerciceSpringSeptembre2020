package com.formation.epita.mylibraries.librairie;

public interface ILibrairieService {

    void create (Librairie librairie);
    Librairie findByid (Long id);
}
