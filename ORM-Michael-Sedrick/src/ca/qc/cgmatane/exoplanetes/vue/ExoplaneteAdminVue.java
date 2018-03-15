package ca.qc.cgmatane.exoplanetes.vue;

import ca.qc.cgmatane.exoplanetes.action.Controleur;
import ca.qc.cgmatane.exoplanetes.action.ControleurAdmin;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ExoplaneteAdminVue extends Application {
    protected int largeurFenetre = 600,
            hauteurFenetre = 400;
    protected String nomFenetre = "Panneau admin Les Exoplanètes";
    protected ControleurAdmin controleur = new ControleurAdmin(this);
    Button btnAjouter;
    Button btnModifier;
    Button btnSupprimer;
    List<Button> listeBouton = new ArrayList<Button>();
    protected VBox racine;
    @Override

    public void start(Stage scenePrincipale) throws Exception {
        racine = new VBox();
        scenePrincipale.setScene(new Scene(racine, largeurFenetre, hauteurFenetre));
        btnAjouter = new Button();
        btnModifier = new Button();
        btnSupprimer = new Button();
        racine.getChildren().add(btnAjouter);
        racine.getChildren().add(btnModifier);
        racine.getChildren().add(btnSupprimer);
        scenePrincipale.show();

        btnAjouter.setText("Ajouter une exoplanete");
        btnSupprimer.setText("Supprimer une exoplanete");

        btnModifier.setText("modifier une exoplanete");

        btnModifier.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                racine.getChildren().clear();
                List<Button> listeBouton = controleur.getListeBoutonExoplanetes();
                for (Button b: listeBouton)
                {
                    b.setOnAction(new EventHandler<ActionEvent>() {
                        @Override public void handle(ActionEvent e) {
                            //get l'id de la planete a modifier avec getIndexOf()
                            //appeler la fonction (a creer) modifier planete dans controleurAdmin avec l'id en param

                        }
                    });
                    racine.getChildren().add(b);

                }
            }
        });


    }
}
