package webshop;

import com.opencsv.CSVWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.FileWriter;
import java.util.ArrayList;

public class CategorieController {

    @FXML
    private TableView tableCategorie;
    @FXML
    private Label txtbevestiging;
    @FXML
    private TextField txtid;
    @FXML
    private TextField txtCategorie;
    @FXML
    private BorderPane pane;

    @FXML
    private void catToevoegen(ActionEvent event){
        MeerdereSchermenTonen object = new MeerdereSchermenTonen();
        Pane view = object.getPage("CategorieToevoegen");
        pane.setCenter(view);
    }

    @FXML
    private void catAnnuleren(ActionEvent actionEvent) {
        MeerdereSchermenTonen object = new MeerdereSchermenTonen();
        Pane view = object.getPage("Categorie");
        pane.setCenter(view);
    }

    @FXML
    private void catOpslaan(ActionEvent actionEvent) {
        String bestandspad = "./src/webshop/categorieen.csv";
        ArrayList<CategorieModel> categorieToevoegen = new ArrayList<CategorieModel>();
        categorieToevoegen.add( new CategorieModel(txtid.getText(), txtCategorie.getText()) );
        schrijfCSV(categorieToevoegen, bestandspad);
        txtbevestiging.setText("Categorie toegevoegd!");

    }

    @FXML
    private static void schrijfCSV(ArrayList<CategorieModel> categorieen, String path) {
        try {
            CSVWriter writer = new CSVWriter((new FileWriter(path, true)));
            for (CategorieModel cate: categorieen ) {
                String[] entry = {String.valueOf(cate.getId()), cate.getNaam()};
                writer.writeNext(entry);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
