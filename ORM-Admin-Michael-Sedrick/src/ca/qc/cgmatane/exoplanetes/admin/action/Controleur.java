package ca.qc.cgmatane.exoplanetes.admin.action;

import ca.qc.cgmatane.exoplanetes.admin.dao.ExoplaneteDAO;
import ca.qc.cgmatane.exoplanetes.admin.modele.Exoplanete;
import ca.qc.cgmatane.exoplanetes.admin.vue.ExoplaneteVue;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class Controleur {
    protected ExoplaneteVue vueAdmin;
    protected ExoplaneteDAO exoplaneteDAO;

    public Controleur(ExoplaneteVue vue) {

        this.vueAdmin = vue;

        exoplaneteDAO = new ExoplaneteDAO();

    }

    /*public List<Button> getListeBoutonExoplanetes() {
        List<Button> listeBouton = new ArrayList<Button>();
        List<Exoplanete> exoplanetes = exoplaneteDAO.rechercherInformationsExoplanete();
        for (Exoplanete e : exoplanetes) {
            listeBouton.add(new Button(e.getPlanete()));
        }
        return listeBouton;
    }

    public void ajouterExoplanete() {

    }

    public void modifierExoplanete() {

    }

    public void SupprimerExoplanete(int id) {
        exoplaneteDAO.SupprimerExoplanete(id);
    }*/
}
