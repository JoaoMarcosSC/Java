package JPA.libraryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	/*
	AutorDTO
	@Size
	@Past

	Postman

	Banco

	Aula: 93
	Minuto: 10:35
	 */

}
