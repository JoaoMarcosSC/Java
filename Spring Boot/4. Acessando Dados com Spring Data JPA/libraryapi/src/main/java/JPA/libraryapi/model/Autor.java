package JPA.libraryapi.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Getter @Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Autor {

    @Column
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "nacionalidade", length = 50, nullable = false)
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")
    List<Livro> livros;


}
