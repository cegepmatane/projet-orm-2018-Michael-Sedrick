package ca.qc.cgmatane.exoplanetes.vue;

import ca.qc.cgmatane.exoplanetes.action.Controleur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class ExoplaneteVue extends Application{
    protected int largeurFenetre = 400,
                hauteurFenetre = 400;

    protected String nomFenetre = "Les Exoplanètes";

    protected Controleur controleur;

    @Override
    public void start(Stage scenePrincipal){
        scenePrincipal.setScene(new Scene(new TextFlow(), largeurFenetre, hauteurFenetre));
        scenePrincipal.setTitle(nomFenetre);

        scenePrincipal.show();
        controleur = new Controleur(this);
    }
}
