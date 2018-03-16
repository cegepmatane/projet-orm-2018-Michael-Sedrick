package ca.qc.cgmatane.exoplanetes.admin.action;

import ca.qc.cgmatane.exoplanetes.admin.dao.ExoplaneteDAO;
import ca.qc.cgmatane.exoplanetes.admin.modele.Exoplanete;
import ca.qc.cgmatane.exoplanetes.admin.vue.ExoplaneteVue;
import java.util.List;

public class Controleur {
    protected ExoplaneteVue vueAdmin;
    protected ExoplaneteDAO exoplaneteDAO;
    protected List<Exoplanete> exoplanetes;

    public Controleur(ExoplaneteVue vue) {
        this.vueAdmin = vue;
        exoplaneteDAO = new ExoplaneteDAO();
    }

    public void ajouterExoplanete() {
        System.out.println("Ajouter");
    }

    public void modifierExoplanete() {
        System.out.println("Modifier");
        exoplanetes = exoplaneteDAO.rechercherInformationsExoplanete();

        for (Exoplanete e: exoplanetes) {
            System.out.println(e.getPlanete());
        }
    }

    public void supprimerExoplanete() {
        System.out.println("Supprimer");
        exoplanetes = exoplaneteDAO.rechercherInformationsExoplanete();

        for (Exoplanete e : exoplanetes) {
            System.out.println(e.getPlanete());
        }
    }
}
