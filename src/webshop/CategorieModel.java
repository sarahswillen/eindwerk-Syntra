package webshop;

public class CategorieModel {
    private String id;
    private String naam;

    public CategorieModel(String id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
