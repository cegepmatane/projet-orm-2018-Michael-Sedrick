package ca.qc.cgmatane.exoplanetes.dao;

import ca.qc.cgmatane.exoplanetes.modele.memento.MementoExoplanete;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class MementoDAO {

    public MementoDAO(){}

    public void sauvegarder(MementoExoplanete memento)
    {

        String nomDeFichier = memento.getNom() + ".xml";
        String xml = "<memento><planete>" + memento.getNom() + "</planete><etoile>" + memento.getExoplanete().getEtoile() + "</etoile><masse>" + memento.getExoplanete().getMasse() + "</masse><rayon>" + memento.getExoplanete().getRayon() + "</rayon><flux>" + memento.getExoplanete().getFlux() + "</flux></memento>";
        FileOutputStream flux = null;

        try
        {
            flux = new FileOutputStream(nomDeFichier);
            flux.write(xml.getBytes());
            flux.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
