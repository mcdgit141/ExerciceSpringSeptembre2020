package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Librairie;
import com.formation.epita.mylibrairies.domain.TypeLibrairie;
import com.formation.epita.mylibrairies.domain.Directeur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibrairieDao extends JpaRepository<LibrairieEntity, Long> {

    List<LibrairieEntity> findByTypeLibrairie(TypeLibrairie type);

    List<LibrairieEntity> findByDirecteurPrenom(String prenom);

}
