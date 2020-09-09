package com.formation.epita.mylibrairies.exposition;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUser (Authentication authentication) {
        return "Vous êtes " + authentication.getName() + " avec les rôles associés suivants " + authentication.getAuthorities();
    }
}
