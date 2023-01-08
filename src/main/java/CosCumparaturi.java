import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi implements Gestiune {


    private List<Produs> listaProduseCos = new ArrayList<>();

    @Override
    public void adaugaProdus(Produs produs) {
        listaProduseCos.add(produs);
    }

    @Override
    public void eliminaProdus(Produs produs) {
        listaProduseCos.remove(produs);
    }

    public List<Produs> getListaProduseCos() {
        return listaProduseCos;
    }

    public void clearListaProduseCos() {
        this.listaProduseCos.clear();
        System.out.println("Cosul este gol.");
    }

    public List trimiteComanda() {
        //??? sau cu this.return listaProduseCos; ???
        System.out.println("Comanda a fost trimisa la procesatorul de plati.");
        return listaProduseCos;
    }

    @Override
    public String toString() {
        return "CosCumparaturi{" +
                "listaProduseCos=" + listaProduseCos +
                '}';
    }
}
