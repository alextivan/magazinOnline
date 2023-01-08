public class Categorii {
    private String numeCategorie;
    private int idCategorie;

    public String getNumeCategorie() {
        return numeCategorie;
    }

    public void setNumeCategorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
    }


    @Override
    public String toString() {
        return "Categorii{" +
                "numeCategorie='" + numeCategorie + '\'' +
                '}';
    }
}
