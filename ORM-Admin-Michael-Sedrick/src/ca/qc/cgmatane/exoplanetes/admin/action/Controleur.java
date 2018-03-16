package ca.qc.cgmatane.exoplanetes.admin.action;

import ca.qc.cgmatane.exoplanetes.admin.dao.ExoplaneteDAO;
import ca.qc.cgmatane.exoplanetes.admin.modele.Exoplanete;
import ca.qc.cgmatane.exoplanetes.admin.vue.ExoplaneteVue;

import java.util.List;

public class Controleur {
    protected ExoplaneteVue vue;
    protected ExoplaneteDAO exoplaneteDAO;
    protected List<Exoplanete> exoplanetes;

    public Controleur(ExoplaneteVue vue) {
        this.vue = vue;
        exoplaneteDAO = new ExoplaneteDAO();
    }

    public void ajouterExoplanete() {
        System.out.println("Ajouter");
    }

    public void afficherExoplanetesModifier() {
        //System.out.println("Modifier");
        exoplanetes = exoplaneteDAO.rechercherInformationsExoplanete();

        vue.afficherBoutonsExoplanetes(exoplanetes, false);
        /*for (Exoplanete e : exoplanetes) {
            //System.out.println(e.getPlanete());
            new Button(e.getPlanete());
        }*/
    }

    public void afficherExoplanetesSupprimer() {
        //System.out.println("Supprimer");
        exoplanetes = exoplaneteDAO.rechercherInformationsExoplanete();

        vue.afficherBoutonsExoplanetes(exoplanetes, true);
        /*for (Exoplanete e : exoplanetes) {
            System.out.println(e.getPlanete());
        }*/
    }
}
