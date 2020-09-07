package com.formation.epita.mylibrairies.pack;

import com.formation.epita.mylibrairies.domain.*;
import com.formation.epita.mylibrairies.infrastructure.LibrairieDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //permet d'exécuter en parallèle les tests et l'application
//
//class LibrairieApplicationTests {
//
//	private final Adresse adresse = new Adresse("1","Rue des Fleurs","Vincennes","94100");
//	private final Directeur directeur = new Directeur("René","RABELAIS");
//
//	private final Librairie ASSOCIATIVE_LIBRAIRIE_MONTREUIL = new Librairie(1L, TypeLibrairie.associative,adresse, directeur);
//
//	@Autowired
//	private TestRestTemplate testRestTemplate;
//
//	@Autowired
//	LibrairieRepository librairieRepository;
//
//	@Test
//	@DisplayName("Doit retourner une librairie si la création s'est bien passée")
//	void test_create_1() {
//		//given
//
//		// when
//		ResponseEntity<Librairie> response = testRestTemplate.postForEntity(
//				"/v1/gestlibrairie/creation",
//				ASSOCIATIVE_LIBRAIRIE_MONTREUIL,
//				Librairie.class
//		);
//		// then
//		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
//		Librairie librairie = response.getBody();
//		assertThat(librairie)
//				.isNotNull();
//	}
//
//	@Test
//	@DisplayName("Doit retourner une erreur Not FOUND quand pas de librairie créée")
//	void test_create_2(){
//		// given
//
//        librairieRepository.suppressionLibrairie(ASSOCIATIVE_LIBRAIRIE_MONTREUIL);
//		//when
//		ResponseEntity<Librairie> response = testRestTemplate.getForEntity("/v1/gestlibrairie/listeid/1", Librairie.class);
//		//then
//		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
//	}
//
////	@Test
////	@DisplayName("Doit retourner une librairie quand id librairie existant")
////	void test_create_3(){
////		// given
////		librairieRepository.enregistrerLibrairie(NATIONALE_LIBRAIRIE_MONTREUIL);
////
////		//when
////
////		ResponseEntity<Librairie> response = testRestTemplate.getForEntity("/v1/gestlibrairie/listeid/1", Librairie.class);
////		//then
////		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
////		assertThat(response.getBody().getTypeLibrairie()).isEqualTo(TypeLibrairie.nationale);
////	}
//}
