package ca.qc.cgmatane.exoplanetes.admin.vue;

import ca.qc.cgmatane.exoplanetes.admin.action.Controleur;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ExoplaneteVue extends Application{

    protected Controleur controleur;

    protected String nomFenetre = "Les Exoplanetes - Admin";
    protected int largeurFenetre = 600,
                    hauteurFenetre = 400;

    protected VBox racine;

    protected Button boutonAjouter,
                    boutonModifier,
                    boutonSupprimer;

    @Override
    public void start(Stage scenePrincipal) {
        boutonAjouter = new Button("Ajouter");
        boutonAjouter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controleur.ajouterExoplanete();
            }
        });
        boutonModifier = new Button("Modifier");
        boutonModifier.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controleur.modifierExoplanete();
            }
        });
        boutonSupprimer = new Button("Supprimer");
        boutonSupprimer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controleur.supprimerExoplanete();
            }
        });

        racine = new VBox();
        racine.getChildren().add(boutonAjouter);
        racine.getChildren().add(boutonModifier);
        racine.getChildren().add(boutonSupprimer);
        scenePrincipal.setScene(new Scene(racine,largeurFenetre, hauteurFenetre));
        scenePrincipal.setTitle(nomFenetre);
        scenePrincipal.show();
        controleur = new Controleur(this);
    }
}
