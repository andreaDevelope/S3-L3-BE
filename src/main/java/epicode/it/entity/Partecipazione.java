package epicode.it.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToMany
    private List<Persona> persone = new ArrayList<>();

    @ManyToOne
    private Evento evento;
}
