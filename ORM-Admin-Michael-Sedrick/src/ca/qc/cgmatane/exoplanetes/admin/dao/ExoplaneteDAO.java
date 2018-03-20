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
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();
        Exoplanete exoplanete = new Exoplanete();

       exoplanete.setPlanete(planete);
       exoplanete.setEtoile(etoile);
       exoplanete.setTypeEtoile(type);
       exoplanete.setMasse(masse);
       exoplanete.setRayon(rayon);
       exoplanete.setFlux(flux);
       exoplanete.setTemperature(temperature);
       exoplanete.setPeriode(periode);
       exoplanete.setDistance(distance);
       exoplanete.setZone(zone);
       exoplanete.setHzd(hzd);
       exoplanete.setHzc(hzc);
       exoplanete.setHza(hza);
       exoplanete.setpClasse(pClasse);
       exoplanete.sethClasse(hClasse);
       exoplanete.setDistance2(distance2);
       exoplanete.setStatus(status);
       exoplanete.setDecouverte(decouverte);

       session.save(exoplanete);


        /*String sql = "INSERT INTO exoplanetes(planete, etoile, typeEtoile, masse ,rayon ,flux, temperature, periode, distance, zone, ist, sph, hzd, hzc, hza, pClasse, hClasse, phi, distance2, status, decouverte) VALUES (" + planete +", "+ etoile +", "+ type + ", " + masse +", " + rayon + ", " + flux + ", " + temperature + ", " + periode +", "+ distance +", "+ zone +", "+ ist +", "+ sph +", "+ hzd +", "+ hzc +", "+ hzc +", "+ hza +", "+ pClasse +", "+ hClasse +", "+ phi +", "+ distance2 +", "+ status +", " + decouverte + ")";


        Query q = session.createQuery(sql);
        q.executeUpdate();
        */
    }
    //String planete, String etoile, String typeEtoile, String masse, String rayon, String flux, String temperature, String periode, String distance, String zone, float ist, float sph, float hzd, String hzc, String hza, String pClasse, String hClasse, float phi, String distance2, String status, String decouverte

    public void modifierExoplanete(String planete, String etoile, String type , String masse, String rayon, String flux, String temperature, String periode, String distance, String zone, String ist, String sph, String hzd, String hzc, String hza, String pClasse, String hClasse, String phi, String distance2, String status, String decouverte) {
        String sql = "UPDATE exopanetes SET planete = " + planete +", etoile = "+ etoile +", typeEtoile = " + type + ", masse = " + masse +", rayon = " + rayon + ", flux = " + flux + ", temperature = " + temperature + ", periode = " + periode +", distance = "+ distance +", zone = "+ zone +", ist = "+ ist +", sph = "+ sph +", hzd = "+ hzd +", hzc = "+ hzc +", hzc = "+ hzc +", hza = "+ hza +", pClasse = "+ pClasse +", hClasse = "+ hClasse +", phi = "+ phi +", distance2 = "+ distance2 +", status = "+ status +", decouverte = "+ decouverte +" WHERE planete = " + planete;
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();

        Query q = session.createQuery(sql);
        q.executeUpdate();
    }

    public void SupprimerExoplanete(int id) {
        //TODO peut etre un try/catch?
       // String sql =  "DELETE FROM explanetes WHERE planete =" + planete;
        Configuration configuration = new Configuration();
        configuration.addClass(Exoplanete.class);
        SessionFactory sessionControleur = configuration.buildSessionFactory();
        Session session = sessionControleur.openSession();

        Exoplanete exoplanete = (Exoplanete)session.load(Exoplanete.class, id);
        session.delete(exoplanete);
        session.flush();
        /*  Query q = session.createQuery(sql);
            q.executeUpdate();
        */



    }
}
