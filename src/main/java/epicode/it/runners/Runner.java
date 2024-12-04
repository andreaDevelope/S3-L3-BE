package epicode.it.runners;

import epicode.it.dao.EventoDao;
import epicode.it.dao.LocationDAO;
import epicode.it.dao.PartecipazioneDao;
import epicode.it.entity.Evento;
import epicode.it.entity.Location;
import epicode.it.entity.Partecipazione;
import epicode.it.enums.TipoEvento;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;


public class Runner {
    public static void run(EntityManager em){
        Evento e = new Evento();
        Location l = new Location();

        Partecipazione p = new Partecipazione();
        e.setDataEvento(LocalDate.now());
        e.setDescrizione("ciao");
        e.setLocation(l);
        e.setTipoEvento(TipoEvento.PRIVATO);
        e.setTitolo("Danilo Studia");
        e.getPartecipazioni().add(p);
        EventoDao ed = new EventoDao(em);
        PartecipazioneDao pd = new PartecipazioneDao(em);
        LocationDAO ld = new LocationDAO(em);


        pd.save(p);
        ld.save(l);

        ed.save(e);



    }
}
