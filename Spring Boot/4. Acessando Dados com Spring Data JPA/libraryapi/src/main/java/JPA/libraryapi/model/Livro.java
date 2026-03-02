package JPA.libraryapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
@Getter @Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor

public class Livro {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 20)
    private String isbn;

    @Column(length = 150)
    private String titulo;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @Enumerated(EnumType.STRING)
    @Column
    private GeneroLivro genero;

    @Column(precision = 18, scale = 2)
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;



}


