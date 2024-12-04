package epicode.it.dao;

import epicode.it.entity.Evento;
import epicode.it.entity.Location;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LocationDAO {
    EntityManager em;

    public void save(Location l){
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
    }
}
