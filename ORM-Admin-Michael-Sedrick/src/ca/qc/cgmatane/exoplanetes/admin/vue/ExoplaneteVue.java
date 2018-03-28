package ca.qc.cgmatane.exoplanetes.admin.vue;

import ca.qc.cgmatane.exoplanetes.admin.action.Controleur;
import ca.qc.cgmatane.exoplanetes.admin.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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

    protected Stage scenePrincipal;

    @Override
    public void start(Stage scenePrincipal) {
        this.scenePrincipal = scenePrincipal;
        afficherMenPrincipal();
    }
    public void afficherMenPrincipal()
    {
        boutonAjouter = new Button("Ajouter");
        boutonAjouter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controleur.ajouterExoplanete();
            }
        });
       /* boutonModifier = new Button("Modifier");
        boutonModifier.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controleur.afficherExoplanetesModifier();
            }
        });*/
        boutonSupprimer = new Button("Supprimer");
        boutonSupprimer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controleur.afficherExoplanetesSupprimer();
            }
        });

        racine = new VBox();
        racine.getChildren().add(boutonAjouter);
        //racine.getChildren().add(boutonModifier);
        racine.getChildren().add(boutonSupprimer);
        scenePrincipal.setScene(new Scene(racine,largeurFenetre, hauteurFenetre));
        scenePrincipal.setTitle(nomFenetre);
        scenePrincipal.show();
        controleur = new Controleur(this);
    }

    public void afficherBoutonsExoplanetes(List<Exoplanete> exoplanetes, boolean supprimer){
        racine.getChildren().clear();
        List<Button> boutons = new ArrayList<Button>();

        for (int compteur = 0; compteur < exoplanetes.size(); compteur++) {
            //racine.getChildren().add(new Button(e.getPlanete()));
            boutons.add(new Button(exoplanetes.get(compteur).getPlanete()));
            int finalCompteur = compteur;
            boutons.get(compteur).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    //System.out.println(b.getText());
                    if (supprimer) {
                        System.out.println(exoplanetes.get(finalCompteur).getPlanete());
                        controleur.actionBoutonsSupprimmer(exoplanetes.get(finalCompteur));
                    } else {
                        //  controleur.actionBoutonsModifier();
                    }
                }
            });
            racine.getChildren().add(boutons.get(compteur));
        }
        /*for(Button b : boutons){
            b.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println(b.getText());
                    if (supprimer) {
                        controleur.actionBoutonsSupprimmer(boutons.indexOf(b));
                    } else {
                      //  controleur.actionBoutonsModifier();
                    }
                }
            });

            racine.getChildren().add(b);
        }*/
    }

    public void afficherChampsAjouter()
    {
        racine.getChildren().clear();

        Label lblNomPlanete = new Label("Planete");
        TextField nomPlanete = new TextField();

        Label lblNomEtoile = new Label("Etoile");
        TextField nomEtoile = new TextField();

        Label lblTypeEtoile = new Label("Type d'etoile");
        TextField typeEtoile = new TextField();

        Label lblMasse = new Label("Masse");
        TextField masse = new TextField();

        Label lblRayon = new Label("Rayon");
        TextField rayon = new TextField();

        Label lblFlux = new Label("Flux");
        TextField flux = new TextField();



        Button btnSauvegarder = new Button("Sauvegarder les modifications");

        btnSauvegarder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
             controleur.actionBoutonsAjouter(nomPlanete.getText(), nomEtoile.getText(), typeEtoile.getText(), masse.getText() , rayon.getText(), flux.getText());
            }
        });

        racine.getChildren().addAll(lblNomPlanete, nomPlanete, lblNomEtoile, nomEtoile, lblTypeEtoile, typeEtoile, lblMasse, masse, lblRayon, rayon, lblFlux, flux, btnSauvegarder );




    }
}
