package ca.qc.cgmatane.exoplanetes.admin.vue;

import ca.qc.cgmatane.exoplanetes.admin.action.Controleur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class ExoplaneteVue extends Application{

    protected Controleur controleur;

    protected String nomFenetre = "Les Exoplanetes - Admin";
    protected int largeurFenetre = 600,
                    hauteurFenetre = 400;

    protected TextFlow racine;

    @Override
    public void start(Stage scenePrincipal) {
        racine = new TextFlow();

        scenePrincipal.setScene(new Scene(racine,largeurFenetre, hauteurFenetre));
        scenePrincipal.setTitle(nomFenetre);
        scenePrincipal.show();
        controleur = new Controleur(this);
    }
}
