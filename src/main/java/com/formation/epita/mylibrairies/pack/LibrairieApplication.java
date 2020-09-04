package com.formation.epita.mylibrairies.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.formation.epita.mylibrairies.application","com.formation.epita.mylibrairies.exposition",
											"com.formation.epita.mylibrairies.infrastructure",
											"com.formation.epita.mylibrairies.domain","com.formation.epita.mylibrairies.pack"})
@EnableJpaRepositories("com.formation.epita.mylibrairies.infrastructure")
@EntityScan("com.formation.epita.mylibrairies.domain")
public class LibrairieApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrairieApplication.class, args);
	}
}
