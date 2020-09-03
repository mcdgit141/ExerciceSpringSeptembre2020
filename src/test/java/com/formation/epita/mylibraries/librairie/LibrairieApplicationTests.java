package com.formation.epita.mylibraries.librairie;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //permet d'exécuter en parallèle les tests et l'application

class LibrairieApplicationTests {

	private final Adresse adresse = new Adresse("1","Rue des Fleurs","Vincennes","94100");
	private final Directeur directeur = new Directeur("René","RABELAIS");

	private final Librairie NATIONAL_LIBRAIRIE_MONTREUIL = new Librairie(1L,TypeLibrairie.associative,adresse, directeur);

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	@DisplayName("Doit retourner une librairie si la création s'est bien passée")
	void test_create_1() {
		//given

		// when

		ResponseEntity<Librairie> response = testRestTemplate.postForEntity(
				"/v1/gestlibrairie/creation",
				NATIONAL_LIBRAIRIE_MONTREUIL,
				Librairie.class
		);
		// then
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
		Librairie librairie = response.getBody();
		assertThat(librairie)
				.isNotNull();
	}

}
