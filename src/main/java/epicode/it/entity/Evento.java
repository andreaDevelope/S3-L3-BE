package epicode.it.entity;

import epicode.it.enums.TipoEvento;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "eventi")
@Data
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String titolo;

    @Column(nullable = false, name = "data_evento")
    private LocalDate dataEvento;

    @Column(nullable = false)
    private String descrizione;

    @ManyToOne
    private Location location;



    @OneToMany(mappedBy = "evento")
    private List<Partecipazione> partecipazioni = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tipo_evento")
    private TipoEvento tipoEvento;

}
