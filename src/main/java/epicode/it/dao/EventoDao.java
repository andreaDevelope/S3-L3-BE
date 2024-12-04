package epicode.it.dao;

import epicode.it.entity.Evento;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EventoDao {
    EntityManager em;

    public void save(Evento e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
}
