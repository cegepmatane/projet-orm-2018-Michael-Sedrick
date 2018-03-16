package ca.qc.cgmatane.exoplanetes.admin.dao;

import ca.qc.cgmatane.exoplanetes.admin.modele.Exoplanete;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public void ajouterExoplanete(String planete, String etoile, String type , String masse, String rayon, String flux, String temperature, String periode, String distance, String zone, String ist, String sph, String hzd, String hzc, String hza, String pClasse, String hClasse, String phi, String distance2, String status, String decouverte) {

    }
    //String planete, String etoile, String typeEtoile, String masse, String rayon, String flux, String temperature, String periode, String distance, String zone, float ist, float sph, float hzd, String hzc, String hza, String pClasse, String hClasse, float phi, String distance2, String status, String decouverte

    public void modifierExoplanete(String planete, String etoile, String type , String masse, String rayon, String flux, String temperature, String periode, String distance, String zone, String ist, String sph, String hzd, String hzc, String hza, String pClasse, String hClasse, String phi, String distance2, String status, String decouverte) {

    }

    public void SupprimerExoplanete(String planete) {

        String sql =  "DELETE FROM explanetes WHERE planete =" + planete;
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();

       Query q = session.createQuery(sql);
       q.executeUpdate();




    }
}
