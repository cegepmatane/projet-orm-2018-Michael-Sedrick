package ca.qc.cgmatane.exoplanetes.action;

import ca.qc.cgmatane.exoplanetes.dao.ExoplaneteDAO;
import ca.qc.cgmatane.exoplanetes.vue.ExoplaneteVue;
//import ca.qc.cgmatane.exoplanetes.vue.ExoplaneteAdminVue;

public class Controleur {
    protected ExoplaneteVue vue;
    protected ExoplaneteDAO exoplaneteDAO;

    public Controleur(ExoplaneteVue vue) {
        this.vue = vue;

        exoplaneteDAO = new ExoplaneteDAO();
        vue.afficherInformations(exoplaneteDAO.rechercherInformationsExoplanete());
    }

    public void lancerVueAdmin()
    {
        vue.lancerVueAdmin();
    }
}
