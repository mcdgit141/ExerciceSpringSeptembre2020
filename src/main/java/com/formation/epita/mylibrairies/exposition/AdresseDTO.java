package com.formation.epita.mylibrairies.exposition;

public class AdresseDTO {

    final String numero;
    final String rue;
    final String ville;
    final String codePostal;

    public AdresseDTO(String numero, String rue, String ville, String codePostal) {
        this.numero = numero;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

}
