package epicode.it.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String nome;
    private String citta;
}
