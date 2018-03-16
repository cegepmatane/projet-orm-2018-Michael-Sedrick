package ca.qc.cgmatane.exoplanetes.admin.vue;

import ca.qc.cgmatane.exoplanetes.admin.action.Controleur;
import ca.qc.cgmatane.exoplanetes.admin.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
                        controleur.actionBoutonsSupprimmer(b.getText());
                    } else {
                        controleur.actionBoutonsModifier();
                    }
                }
            });

            racine.getChildren().add(b);
        }
    }

    public void afficherChampsDeModification(String planete)
    {
        racine.getChildren().clear();

        Label lblNomPlanete = new Label("Planete");
        TextField nomPlanete = new TextField(planete);

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

        Label lblTemperature = new Label("Temperature");
        TextField temperature = new TextField();

        Label lblPeriode = new Label("Periode");
        TextField periode = new TextField();

        Label lblDistance = new Label("Distance");
        TextField distance = new TextField();

        Label lblZone = new Label("Zone");
        TextField zone = new TextField();

        Label lblIst = new Label("Ist");
        TextField ist = new TextField();

        Label lblSph = new Label("Sph");
        TextField sph = new TextField();

        Label lblHzd = new Label("Hzd");
        TextField hzd = new TextField();

        Label lblHzc = new Label("Hzc");
        TextField hzc = new TextField();

        Label lblHza = new Label("Hza");
        TextField hza = new TextField();

        Label lblPClasse = new Label("P Classe");
        TextField pClasse = new TextField();

        Label lblHClasse = new Label("H Classe");
        TextField hClasse = new TextField();

        Label lblPhi = new Label("Phi");
        TextField phi = new TextField();

        Label lblDistance2 = new Label("Distance 2");
        TextField distance2 = new TextField();

        Label lblStatus = new Label("Status");
        TextField status = new TextField();

        Label lblDecouverte = new Label("Decouverte");
        TextField decouverte = new TextField();

        Button btnSauvegarder = new Button("Sauvegarder les modifications");

        btnSauvegarder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
             controleur.actionBoutonsModifier(nomPlanete.getText(), nomEtoile.getText(), typeEtoile.getText(), masse.getText() , rayon.getText(), flux.getText(), temperature.getText(), periode.getText(), distance.getText(), zone.getText(), ist.getText(), sph.getText(), hzd.getText(), hzc.getText(), hza.getText(), pClasse.getText(), hClasse.getText(), phi.getText(), distance2.getText(), status.getText(), decouverte.getText());
            }
        });

        racine.getChildren().addAll(lblNomPlanete, nomPlanete, lblNomEtoile, nomEtoile, lblTypeEtoile, typeEtoile, lblMasse, masse, lblRayon, rayon, lblFlux, flux, lblTemperature, temperature, lblPeriode, periode, lblDistance, distance, lblZone, zone, lblIst, ist, lblSph, sph, lblHzd, hzd,lblHzc, hzc, lblHza, hza, lblPClasse, pClasse, lblHClasse, hClasse, lblPhi, phi, lblDistance2, distance2, lblStatus, status, lblDecouverte, decouverte, btnSauvegarder );




    }
}
