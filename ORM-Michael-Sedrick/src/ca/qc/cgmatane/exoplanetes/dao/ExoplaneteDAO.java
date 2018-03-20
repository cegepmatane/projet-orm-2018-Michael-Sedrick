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
    SessionFactory sessionControleur;
    Session session;
    public ExoplaneteDAO()
    {
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        sessionControleur = configuration.buildSessionFactory();
        session = sessionControleur.openSession();
    }

    public List<Exoplanete> rechercherInformationsExoplanete() {
        List<Exoplanete> exoplanetes = new ArrayList<Exoplanete>();


        Transaction operation = session.beginTransaction();
        Iterator visiteurExoplanete = session.createQuery("FROM Exoplanete").iterate(); // nom de la classe pas de la table

        //System.out.println(visiteurExoplanete.hasNext());

        while (visiteurExoplanete.hasNext()) {
            Exoplanete exoplanete = (Exoplanete) visiteurExoplanete.next();
            exoplanetes.add(exoplanete);
            //System.out.print(exoplanete.getPlanete() + " ");
            //System.out.println(exoplanete.getDecouverte());
        }

        return exoplanetes;
    }

    public void detruire()
    {
        session.close();
        sessionControleur.close();
    }
}
