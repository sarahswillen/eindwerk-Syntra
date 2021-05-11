package webshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private BorderPane mainPaine;

    @FXML
    private void handleButtonCategorie(ActionEvent event){
        System.out.println("you clicked me");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Categorie");
        mainPaine.setCenter(view);
    }

    public void handleButtonArtikels(ActionEvent actionEvent) {
        System.out.println("you clicked me");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Artikels");
        mainPaine.setCenter(view);
    }

    public void handleButtonKlanten(ActionEvent actionEvent) {
        System.out.println("you clicked me");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Klanten");
        mainPaine.setCenter(view);
    }

    public void handleButtonReviews(ActionEvent actionEvent) {
        System.out.println("you clicked me");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Reviews");
        mainPaine.setCenter(view);
    }

    public void handleButtonActieCodes(ActionEvent actionEvent) {
        System.out.println("you clicked me");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("ActieCode");
        mainPaine.setCenter(view);
    }

    public void handleButtonDashboard(ActionEvent actionEvent) {
        System.out.println("you clicked me");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Dashboard");
        mainPaine.setCenter(view);

    }
}
