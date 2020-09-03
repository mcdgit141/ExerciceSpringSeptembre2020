package com.formation.epita.mylibraries.librairie;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/v1/gestlibrairie")

public class ExpositionLibrairie {

    @Autowired
    private ILibrairieService iLibrairieService;

    @PostMapping(value = "/creation", consumes = { "application/json" }, produces =  { "application/json" })
    @ResponseStatus(HttpStatus.CREATED)
    public Librairie createLibrairie(@NotNull @RequestBody Librairie librairie) {

        if (librairie != null) {
            iLibrairieService.create(librairie);
            }
        return librairie;
    }

    @GetMapping(value = "/listeid/{id}" , produces = {"application/json"})
    public ResponseEntity<Librairie> rechercheLibrairieParId (@PathVariable("id") Long id) {

        final Librairie librairie = iLibrairieService.findByid(id);
        return new ResponseEntity<Librairie>(librairie, HttpStatus.OK);

    }


}
