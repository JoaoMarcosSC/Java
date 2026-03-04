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
	ErroCampo
	campo, erro

	ErroResposta
	status, mensagem, ErroCampo
	static respostaPadrao
	conflito

	Postman

	Banco

	Aula: 85
	Minuto: 0:01
	 */

}
