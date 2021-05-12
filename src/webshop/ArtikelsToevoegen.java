package webshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ArtikelsToevoegen {

    @FXML
    private BorderPane pane;

    public void artikelToevoegen(ActionEvent actionEvent) {
        MeerdereSchermenTonen object = new MeerdereSchermenTonen();
        Pane view = object.getPage("ArtikelsToevoegen");
        pane.setCenter(view);
    }
}
