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

    public List<Exoplanete> rechercherInformationsExoplanete(){
        List<Exoplanete> exoplanetes = new ArrayList<Exoplanete>();
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();

        Transaction operation = session.beginTransaction();
        Iterator visiteurExoplanete = session.createQuery("FROM Exoplanete").iterate(); // nom de la classe pas de la table

        //System.out.println(visiteurExoplanete.hasNext());

        while(visiteurExoplanete.hasNext()){
            Exoplanete exoplanete = (Exoplanete) visiteurExoplanete.next();
            exoplanetes.add(exoplanete);
            //System.out.println(exoplanete.getPlanete());
        }

        session.close();
        sessionControleur.close();

        return exoplanetes;
    }
    public void ajouterExoplanete()
    {

    }
    public void modifierExoplanete(String planete, String etoile,String  typeEtoile,String masse,String rayon,String flux,String temperature,String  periode,String  distance,String zone, float ist, float sph,float hzd, String hzc,String  hza,String pClasse,String hClasse,  float phi,String distance2, String status,String decouverte)
    {
        
    }
    public void SupprimerExoplanete(int id)
    {
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();
            Exoplanete exoplanete = (Exoplanete)session.get(Exoplanete.class, id);
            session.delete(exoplanete);
            tx.commit();
        }catch (HibernateException e)
        {
            if(tx == null)tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


    }
}
