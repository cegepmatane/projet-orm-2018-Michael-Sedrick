package ca.qc.cgmatane.exoplanetes.action;

import ca.qc.cgmatane.exoplanetes.dao.ExoplaneteDAO;
import ca.qc.cgmatane.exoplanetes.modele.Exoplanete;
//import ca.qc.cgmatane.exoplanetes.vue.ExoplaneteAdminVue;
import ca.qc.cgmatane.exoplanetes.vue.ExoplaneteVue;
import javafx.scene.control.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ControleurAdmin {
    protected ExoplaneteVue vueAdmin;
    protected ExoplaneteDAO exoplaneteDAO;

    public ControleurAdmin(ExoplaneteVue vue) {

        this.vueAdmin = vue;

        exoplaneteDAO = new ExoplaneteDAO();

    }
    public List<Button> getListeBoutonExoplanetes()
    {
        List<Button> listeBouton = new ArrayList<Button>();
        List<Exoplanete> exoplanetes = exoplaneteDAO.rechercherInformationsExoplanete();
        for (Exoplanete e : exoplanetes) {
            listeBouton.add(new Button(e.getPlanete()));
        }
        return listeBouton;
    }
    public void ajouterExoplanete()
    {

    }
    public void modifierExoplanete()
    {

    }
    public void SupprimerExoplanete(int id)
    {
        exoplaneteDAO.SupprimerExoplanete(id);
    }

}
