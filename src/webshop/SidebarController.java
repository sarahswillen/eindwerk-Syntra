package webshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class SidebarController {
    @FXML
    private Label label;

    @FXML
    private BorderPane mainPane;

    @FXML
    private void handleButtonCategorie(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Categorie");
        mainPane.setCenter(view);

    }

    public void handleButtonArtikels(ActionEvent actionEvent) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Artikels");
        mainPane.setCenter(view);
    }

    public void handleButtonKlanten(ActionEvent actionEvent) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Klanten");
        mainPane.setCenter(view);
    }

    public void handleButtonReviews(ActionEvent actionEvent) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Reviews");
        mainPane.setCenter(view);
    }

    public void handleButtonActieCodes(ActionEvent actionEvent) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("ActieCode");
        mainPane.setCenter(view);
    }

    public void handleButtonDashboard(ActionEvent actionEvent) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Dashboard");
        mainPane.setCenter(view);

    }
}
