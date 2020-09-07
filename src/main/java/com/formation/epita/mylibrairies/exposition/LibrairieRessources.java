package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.application.LibrairieService;
import com.formation.epita.mylibrairies.domain.Librairie;
import com.formation.epita.mylibrairies.domain.TypeLibrairie;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/v1/gestlibrairie")

public class LibrairieRessources {

    @Autowired
    private LibrairieService iLibrairieService;

//    @PostMapping(value = "/creation", consumes = { "application/json" }, produces =  { "application/json" })
//    @ResponseStatus(HttpStatus.CREATED)
//    public Librairie createLibrairie(@NotNull @RequestBody Librairie librairie) {
//
//        if (librairie != null) {
//            iLibrairieService.create(librairie);
//            }
//        return librairie;
//    }

    @PostMapping(value = "/dto/creation", consumes = { "application/json" }, produces =  { "application/json" })
    @ResponseStatus(HttpStatus.CREATED)
    public Librairie createLibrairieDTO(@NotNull @RequestBody LibrairieDTO librairieDTO) {

        if (librairieDTO != null) {
           Librairie librairie = iLibrairieService.create(LibrairieDTOMapper.expoToDomain(librairieDTO));
            return librairie;
        }
       return null;
    }

    @GetMapping(value = "/listeid/{id}" , produces = {"application/json"})
    public ResponseEntity<Librairie> rechercheLibrairieParId (@PathVariable("id") Long id) {
//        try {
            final Librairie librairie = iLibrairieService.rechercheLibrairieParId(id);
            return new ResponseEntity<Librairie>(librairie, HttpStatus.OK);
//        } catch (RuntimeException ex) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Librairie non trouvée avec cet id : " + id, ex );
//        }
    }

    @GetMapping(value = "/listeall" , produces = {"application/json"})
    public ResponseEntity<List<Librairie>> afficheTout () {

        final List<Librairie> librairie = (List<Librairie>) iLibrairieService.rechercheTouteLibrairie();
        return new ResponseEntity<List<Librairie>>(librairie, HttpStatus.OK);

    }

    @GetMapping(value = "/listetype/{type}" , produces = {"application/json"})
    public ResponseEntity<List<Librairie>> rechercheLibrairieType (@PathVariable("type") TypeLibrairie type) {

        final List<Librairie> librairie = (List<Librairie>) iLibrairieService.rechercheLibrairieParType(type);
        return new ResponseEntity<List<Librairie>>(librairie, HttpStatus.OK);

    }

    @GetMapping(value = "/listeprenom/{prenom}" , produces = {"application/json"})
    public ResponseEntity<List<Librairie>> rechercheLibrairiePrenom (@PathVariable("prenom") String prenom) {

        final List<Librairie> librairie =  iLibrairieService.rechercheLibrairieParPrenom(prenom);
        return new ResponseEntity<List<Librairie>>(librairie, HttpStatus.OK);

    }

    @PutMapping("/miseajour/{librairieId}")
    @ResponseStatus(HttpStatus.OK)
    public void miseajourLibrairie(@NotNull @PathVariable("librairieId") Long librairieId, @RequestBody Librairie librairie) {

            iLibrairieService.miseajourLibrairie( librairieId, librairie);
    }

    @DeleteMapping("/suppression/{librairieId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void suppressionLibrairie(@PathVariable("librairieId") Long librairieId) {
        this.iLibrairieService.suppression(librairieId);
    }
}
