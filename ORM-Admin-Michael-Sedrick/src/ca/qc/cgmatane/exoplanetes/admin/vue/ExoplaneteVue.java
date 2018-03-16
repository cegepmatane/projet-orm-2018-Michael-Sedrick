package ca.qc.cgmatane.exoplanetes.admin.vue;

import ca.qc.cgmatane.exoplanetes.admin.action.Controleur;
import ca.qc.cgmatane.exoplanetes.admin.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

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
                controleur.afficherExoplanetesModifier();
            }
        });
        boutonSupprimer = new Button("Supprimer");
        boutonSupprimer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controleur.afficherExoplanetesSupprimer();
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

    public void afficherBoutonsExoplanetes(List<Exoplanete> exoplanetes, boolean supprimer){
        racine.getChildren().clear();
        List<Button> boutons = new ArrayList<Button>();
        for (Exoplanete e : exoplanetes) {
            //racine.getChildren().add(new Button(e.getPlanete()));
            boutons.add(new Button(e.getPlanete()));
        }
        for(Button b : boutons){
            b.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println(b.getText());
                    if (supprimer) {
                        System.out.println(supprimer);
                    } else {
                        System.out.println(supprimer);
                    }
                }
            });

            racine.getChildren().add(b);
        }
    }
}
