package com.formation.epita.mylibrairies.domain;

import java.util.List;
import java.util.Optional;

public interface LibrairieRepository {

    void enregistrerLibrairie(Librairie librairie);

    Optional<Librairie> rechercheLibrairieId(Long id);

    List<Librairie> rechercheTouteLibrairie();

    List<Librairie> rechercheTypeLibrairie(TypeLibrairie type);

    List<Librairie> rechercheLibrairieByDirecteurPrenom(String prenom);

    void suppressionLibrairie(Librairie librairie);

}
