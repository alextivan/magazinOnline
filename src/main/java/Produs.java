public class Produs {
    private String numeProdus;
    private String pret;
    private Categorii categorie;
    private int stocBucati;

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public Categorii getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorii categorie) {
        this.categorie = categorie;
    }

    public int getStocBucati() {
        return stocBucati;
    }

    public void setStocBucati(int stocBucati) {
        this.stocBucati = stocBucati;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "numeProdus='" + numeProdus + '\'' +
                ", pret='" + pret + '\'' +
                ", categorie=" + categorie +
                ", stocBucati=" + stocBucati +
                '}';
    }
}
