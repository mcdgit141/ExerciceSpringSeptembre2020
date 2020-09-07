package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.GenreLitteraire;

public class LivresDTO {
    final String titre;
    final String auteur;
    final Integer nombreDePages;

    final GenreLitteraire genreLitteraire;

    public LivresDTO(String titre, String auteur, Integer nombreDePages, GenreLitteraire genreLitteraire) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.genreLitteraire = genreLitteraire;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public Integer getNombreDePages() {
        return nombreDePages;
    }

    public GenreLitteraire getGenreLitteraire() {
        return genreLitteraire;
    }
}
