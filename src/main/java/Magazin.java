import java.util.ArrayList;
import java.util.List;

public class Magazin implements Gestiune {
    public String nume = "theMag";
    private List<Categorii> listaCategorii = new ArrayList<>();
    private List<Produs> listaProduseStoc = new ArrayList<>();

    private CosCumparaturi cosCumparaturi = new CosCumparaturi();


    public void adaugaProdus(Produs produs) {
        listaProduseStoc.add(produs);
    }

    public void eliminaProdus(Produs produs) {
        listaProduseStoc.remove(produs);
    }

    public void adaugaCategorie(Categorii categorie) {
        listaCategorii.add(categorie);
    }

    public void eliminaCategorie(Categorii categorie) {
        listaCategorii.remove(categorie);
    }

    public List<Categorii> getListaCategorii() {
        return listaCategorii;
    }

    public List<Produs> getListaProduseStoc() {
        return listaProduseStoc;
    }


}
