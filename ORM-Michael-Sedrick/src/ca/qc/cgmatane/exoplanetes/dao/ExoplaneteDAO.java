package ca.qc.cgmatane.exoplanetes.dao;

import ca.qc.cgmatane.exoplanetes.modele.Exoplanete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ExoplaneteDAO {

    public List<Exoplanete> rechercherInformationsExoplanete() {
        List<Exoplanete> exoplanetes = new ArrayList<Exoplanete>();
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();

        Transaction operation = session.beginTransaction();
        Iterator visiteurExoplanete = session.createQuery("FROM Exoplanete").iterate(); // nom de la classe pas de la table

        //System.out.println(visiteurExoplanete.hasNext());

        while (visiteurExoplanete.hasNext()) {
            Exoplanete exoplanete = (Exoplanete) visiteurExoplanete.next();
            exoplanetes.add(exoplanete);
            //System.out.println(exoplanete.getPlanete());
        }

        session.close();
        sessionControleur.close();

        return exoplanetes;
    }
}
