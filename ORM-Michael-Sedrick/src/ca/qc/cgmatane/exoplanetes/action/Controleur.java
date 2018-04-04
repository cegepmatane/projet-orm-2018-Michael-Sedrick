package ca.qc.cgmatane.exoplanetes.action;

import ca.qc.cgmatane.exoplanetes.dao.ExoplaneteDAO;
import ca.qc.cgmatane.exoplanetes.modele.Exoplanete;
import ca.qc.cgmatane.exoplanetes.modele.memento.MementoExoplanete;
import ca.qc.cgmatane.exoplanetes.modele.memento.MemoireDesExoplanetes;
import ca.qc.cgmatane.exoplanetes.vue.ExoplaneteVue;
//import ca.qc.cgmatane.exoplanetes.vue.ExoplaneteAdminVue;

public class Controleur {
    protected ExoplaneteVue vue;
    protected ExoplaneteDAO exoplaneteDAO;
    protected MemoireDesExoplanetes memoire;

    public Controleur(ExoplaneteVue vue) {
        this.vue = vue;

        exoplaneteDAO = new ExoplaneteDAO();
        memoire = new MemoireDesExoplanetes();
        vue.afficherInformations(exoplaneteDAO.rechercherInformationsExoplanete());
    }

    public void memoriserExoplanete(Exoplanete exoplanete)
    {
        MementoExoplanete memento = new MementoExoplanete(exoplanete);
        memoire.memoriser(memento);
    }

}
