package webshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Categorie {

    @FXML
    private BorderPane pane;

    @FXML
    private void catToevoegen(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("CategorieToevoegen");
        pane.setCenter(view);
    }

    public void catAnnuleren(ActionEvent actionEvent) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Categorie");
        pane.setCenter(view);
    }


}
