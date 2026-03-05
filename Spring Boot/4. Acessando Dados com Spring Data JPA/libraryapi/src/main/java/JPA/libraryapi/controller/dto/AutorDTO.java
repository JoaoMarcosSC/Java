package JPA.libraryapi.controller.dto;

import JPA.libraryapi.model.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

public record AutorDTO(UUID ID,
                       @NotBlank(message = "Campo Obrigatório")
                       String nome,
                       @NotNull(message = "Campo Obrigatório")
                       LocalDate dataNascimento,
                       @NotBlank(message = "Campo Obrigatório")
                       String nacionalidade) {

    public Autor mapearParaAutor() {
        Autor autor = new Autor();
        autor.setNome(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);
        return autor;
    }
}
