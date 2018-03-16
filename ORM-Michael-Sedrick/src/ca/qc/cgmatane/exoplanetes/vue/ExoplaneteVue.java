package ca.qc.cgmatane.exoplanetes.vue;

import ca.qc.cgmatane.exoplanetes.action.Controleur;
import ca.qc.cgmatane.exoplanetes.modele.Exoplanete;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.List;

public class ExoplaneteVue extends Application{
    protected int largeurFenetre = 600,
                hauteurFenetre = 400;

    protected String nomFenetre = "Les Exoplanetes";

    protected Controleur controleur;

    protected TextFlow racine;

    @Override
    public void start(Stage scenePrincipal){
        racine = new TextFlow();
        scenePrincipal.setScene(new Scene(racine, largeurFenetre, hauteurFenetre));
        scenePrincipal.setTitle(nomFenetre);

        scenePrincipal.show();
        controleur = new Controleur(this);
    }

    public void afficherInformations(List<Exoplanete> exoplanetes){
        for(Exoplanete e : exoplanetes)
            racine.getChildren().add(new Text(e.getPlanete() + "\n"));
    }
}
