package ca.qc.cgmatane.exoplanetes.modele.memento;

import java.util.HashMap;

public class MemoireDesExoplanetes {

    HashMap<String, MementoExoplanete> listeExoplanete = null;

    public MemoireDesExoplanetes()
    {
        this.listeExoplanete = new HashMap<String, MementoExoplanete>();
    }

    public void memoriser(MementoExoplanete memento){
        this.listeExoplanete.put(memento.getNom(), memento);
    }
    public MementoExoplanete retrouver (String nom)
    {
        return this.listeExoplanete.get(nom);
    }

}
