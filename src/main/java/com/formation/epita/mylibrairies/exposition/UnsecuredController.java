package com.formation.epita.mylibrairies.exposition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unsecured")
public class UnsecuredController {
    @GetMapping
    public String urlDesecurisee(){
        return "ceci est une URL décesurisee qui ne nécessite pas d'authentification";
    }

}
