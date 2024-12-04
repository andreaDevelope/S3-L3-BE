package epicode.it.entity;

import epicode.it.enums.Sesso;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="persone")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private String email;

    private LocalDate dataNascita = LocalDate.of(2024,10,10);

    private Sesso sesso;

    @ManyToMany(mappedBy = "persone")
    private List<Partecipazione> partecipazioni = new ArrayList<>();
}
