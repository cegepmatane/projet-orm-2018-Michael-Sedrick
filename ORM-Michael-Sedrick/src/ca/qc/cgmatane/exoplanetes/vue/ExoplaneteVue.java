package ca.qc.cgmatane.exoplanetes.vue;

import ca.qc.cgmatane.exoplanetes.action.Controleur;
import ca.qc.cgmatane.exoplanetes.action.ControleurAdmin;
import ca.qc.cgmatane.exoplanetes.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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

    protected Button boutonAdmin;

    @Override
    public void start(Stage scenePrincipal){
        racine = new TextFlow();
        boutonAdmin = new Button("Panneau administrateur");
        boutonAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                controleur.lancerVueAdmin();
            }
        });
        scenePrincipal.setScene(new Scene(racine, largeurFenetre, hauteurFenetre));
        scenePrincipal.setTitle(nomFenetre);

        scenePrincipal.show();
        controleur = new Controleur(this);
        racine.getChildren().add(boutonAdmin);
    }

    public void afficherInformations(List<Exoplanete> exoplanetes){
        for(Exoplanete e : exoplanetes)
            racine.getChildren().add(new Text(e.getPlanete() + "\n"));
    }

    public void lancerVueAdmin()
    {
        ControleurAdmin controleurAdmin = new ControleurAdmin(this);
        String nomFenetreAdmin = "Panneau admin Les Exoplanètes";
        Stage stage = new Stage();
        VBox racineAdmin = new VBox();
        stage.setScene(new Scene(racineAdmin, largeurFenetre, hauteurFenetre));
       Button btnAjouter = new Button();
       Button btnModifier = new Button();
       Button btnSupprimer = new Button();
        racineAdmin.getChildren().add(btnAjouter);
        racineAdmin.getChildren().add(btnModifier);
        racineAdmin.getChildren().add(btnSupprimer);
        stage.show();

        btnAjouter.setText("Ajouter une exoplanete");
        btnSupprimer.setText("Supprimer une exoplanete");

        btnSupprimer.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                racineAdmin.getChildren().clear();
                List<Button> listeBouton = controleurAdmin.getListeBoutonExoplanetes();
                for (Button b: listeBouton)
                {
                    b.setOnAction(new EventHandler<ActionEvent>() {
                        @Override public void handle(ActionEvent e) {
                            //get l'id de la planete a supprimer avec getIndexOf()
                            //appeler la fonction (a creer) supprimer planete dans controleurAdmin avec l'id en param
                        }
                    });
                    racineAdmin.getChildren().add(b);
                }
            }
        });

        btnModifier.setText("modifier une exoplanete");
        btnModifier.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                racineAdmin.getChildren().clear();
                List<Button> listeBouton = controleurAdmin.getListeBoutonExoplanetes();
                for (Button b: listeBouton)
                {
                    b.setOnAction(new EventHandler<ActionEvent>() {
                        @Override public void handle(ActionEvent e) {
                            //get l'id de la planete a modifier avec getIndexOf()
                            //appeler la fonction (a creer) modifier planete dans controleurAdmin avec l'id en param

                        }
                    });
                    racineAdmin.getChildren().add(b);

                }
            }
        });

    }
}
