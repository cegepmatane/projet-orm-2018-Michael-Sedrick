package ca.qc.cgmatane.exoplanetes.modele.memento;

import ca.qc.cgmatane.exoplanetes.modele.Exoplanete;

public class MementoExoplanete {

    protected Exoplanete exoplanete;

    public MementoExoplanete(Exoplanete original)
    {
        this.exoplanete = new Exoplanete(original);
    }

    public Exoplanete getExoplanete() {
        return exoplanete;
    }
    public String getNom()
    {
       return exoplanete.getPlanete();
    }
}
