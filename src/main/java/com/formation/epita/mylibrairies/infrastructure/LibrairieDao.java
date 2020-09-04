package com.formation.epita.mylibrairies.infrastructure;

import com.formation.epita.mylibrairies.domain.Librairie;
import com.formation.epita.mylibrairies.domain.TypeLibrairie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibrairieDao extends JpaRepository<Librairie, Long> {

    List<Librairie> findByTypeLibrairie(TypeLibrairie type);

    List<Librairie> findByDirecteurPrenom(String prenom);

}
