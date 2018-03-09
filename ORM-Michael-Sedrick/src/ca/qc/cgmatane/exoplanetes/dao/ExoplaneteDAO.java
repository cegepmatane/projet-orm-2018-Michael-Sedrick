package ca.qc.cgmatane.exoplanetes.dao;

import ca.qc.cgmatane.exoplanetes.modele.Exoplanete;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ExoplaneteDAO {
    public void rechercherInformationsExoplanete(){
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();

        Transaction operation = session.beginTransaction();
        Iterator visiteurExoplanete = session.createQuery("FROM Exoplanete").iterate(); // nom de la classe pas de la table

        //System.out.println(visiteurExoplanete.hasNext());

        while(visiteurExoplanete.hasNext()){
            Exoplanete exoplanete = (Exoplanete) visiteurExoplanete.next();
            System.out.println(exoplanete.getPlanete());
        }

        session.close();
        sessionControleur.close();
    }
}
