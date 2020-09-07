package com.formation.epita.mylibrairies.application;

import com.formation.epita.mylibrairies.domain.Librairie;
import com.formation.epita.mylibrairies.domain.LibrairieRepository;
import com.formation.epita.mylibrairies.domain.TypeLibrairie;
import com.formation.epita.mylibrairies.domain.exception.LibrairieNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LibrairieService {

    @Autowired
    LibrairieRepository librairieRepository;

    public Librairie create (Librairie librairie) {
        librairieRepository.enregistrerLibrairie(librairie);
        return librairie;
    }

    public Librairie rechercheLibrairieParId(Long id) {
        return this.librairieRepository.rechercheLibrairieId(id).orElseThrow(() -> new LibrairieNotFoundException("Librairie non trouvée avec cet id" + id));
    }

    public List<Librairie> rechercheTouteLibrairie(){
        return this.librairieRepository.rechercheTouteLibrairie();
    }

    public List<Librairie> rechercheLibrairieParType(TypeLibrairie type) {
        return this.librairieRepository.rechercheTypeLibrairie(type);
    }

    public List<Librairie> rechercheLibrairieParPrenom(String prenom) {
        return this.librairieRepository.rechercheLibrairieByDirecteurPrenom(prenom);
    }

    public void miseajourLibrairie(Long id, Librairie librairieNewInfo){
        Librairie librairie = rechercheLibrairieParId(id);
        librairie.miseajour(librairieNewInfo);
        this.librairieRepository.enregistrerLibrairie(librairie);
    }
    public void suppression(Long id) {
        Librairie librairie = rechercheLibrairieParId(id);
        this.librairieRepository.suppressionLibrairie(librairie);
    }
}
