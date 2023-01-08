import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean keepGoing = true;
        Magazin magazin = new Magazin();
        CosCumparaturi cosCumparaturi = new CosCumparaturi();

        while (keepGoing) {
            System.out.println("Apasa: " + "0 - EXIT.\n" +
                    " 1 - Adauga categorie de produse.\n" +
                    " 2 - Afiseaza categoriile.\n" +
                    " 3 - Sterge categorie.\n" +
                    " 4 - Adauga produs nou.\n" +
                    " 5 - Afiseaza produsele.\n" +
                    " 6 - Sterge un produs.\n" +
                    " 7 - Adauga un produs in cos.\n" +
                    " 8 - Afiseaza cosul de cumparaturi.\n" +
                    " 9 - Sterge un produs din cos.\n" +
                    " 10 - Lanseaza comanda.");

            Scanner in = new Scanner(System.in);
            int operation = in.nextInt();

            switch (operation) {
                case 0:
                    keepGoing = false;
                    break;
                case 1:
                    System.out.println("Introdu numele categoriei de adaugat: ");
                    Scanner in2 = new Scanner(System.in);
                    String cDeAdaugat = in2.nextLine();
                    Categorii categorie = new Categorii();
                    categorie.setNumeCategorie(cDeAdaugat);
                    magazin.adaugaCategorie(categorie);
                    break;
                case 2:
                    for (int i = 0; i < magazin.getListaCategorii().size(); i++) {
                        System.out.println(magazin.getListaCategorii().get(i));
                    }
                    break;
                case 3:
                    System.out.println("Introdu numele categoriei de sters: ");
                    Scanner in3 = new Scanner(System.in);
                    String cDeSters = in3.nextLine();
                    for (int i = 0; i < magazin.getListaCategorii().size(); i++) {
                        if (magazin.getListaCategorii().get(i).getNumeCategorie().equals(cDeSters)) {
                            magazin.eliminaCategorie(magazin.getListaCategorii().get(i));
                        }
                    }
                    System.out.println("Categoria a fost stearsa");
                    break;
                case 4:
                    System.out.println("Introdu numele produsului de adaugat: ");
                    Scanner in4 = new Scanner(System.in);
                    String pDeAdaugat = in4.nextLine();
                    System.out.println("Introdu categoria produsului de adaugat: ");
                    String categoriaProdusuluiDeAdaugat = in4.nextLine();

                    for (int i = 0; i < magazin.getListaCategorii().size(); i++) {
                        if (magazin.getListaCategorii().get(i).getNumeCategorie().equals(categoriaProdusuluiDeAdaugat)) {
                            Produs produs = new Produs();
                            produs.setNumeProdus(pDeAdaugat);
                            magazin.adaugaProdus(produs);
                            produs.setCategorie(magazin.getListaCategorii().get(i));
                            System.out.println("Produsul a fost adaugat");
                        } else
                            System.out.println("Categoria nu exista");
                    }
                    break;
                case 5:
                    for (int i = 0; i < magazin.getListaProduseStoc().size(); i++) {
                        System.out.println(magazin.getListaProduseStoc().get(i));
                    }
                    break;
                case 6:
                    System.out.println("Introdu numele produsului de sters: ");
                    Scanner in6 = new Scanner(System.in);
                    String pDeSters = in6.nextLine();
                    for (int i = 0; i < magazin.getListaProduseStoc().size(); i++) {
                        if (magazin.getListaProduseStoc().get(i).getNumeProdus().equals(pDeSters)) {
                            magazin.eliminaProdus(magazin.getListaProduseStoc().get(i));
                        }
                    }
                    System.out.println("Produsul a fost sters");
                    break;
                case 7:
                    System.out.println("Introdu numele produsului de adaugat in cos: ");
                    Scanner in7 = new Scanner(System.in);
                    String pDeAdaugatInCos = in7.nextLine();

                    for (int i = 0; i < magazin.getListaProduseStoc().size(); i++) {
                        if (magazin.getListaProduseStoc().get(i).getNumeProdus().equals(pDeAdaugatInCos)) {
                            Produs produsCos = new Produs();
                            produsCos = magazin.getListaProduseStoc().get(i);
                            cosCumparaturi.adaugaProdus(produsCos);
                            System.out.println("Produsul a fost adaugat in cos.");
                        } else
                            System.out.println("Produsul nu este in stoc.");
                    }
                    break;
                case 8:
                    for (int i = 0; i < cosCumparaturi.getListaProduseCos().size(); i++) {
                        System.out.println(cosCumparaturi.getListaProduseCos().get(i));
                    }
                    break;
                case 9:
                    System.out.println("Introdu numele produsului de sters din cos: ");
                    Scanner in9 = new Scanner(System.in);
                    String pDeStersDinCos = in9.nextLine();
                    for (int i = 0; i < cosCumparaturi.getListaProduseCos().size(); i++) {
                        if (cosCumparaturi.getListaProduseCos().get(i).getNumeProdus().equals(pDeStersDinCos)) {
                            cosCumparaturi.eliminaProdus(cosCumparaturi.getListaProduseCos().get(i));
                        }
                    }
                    System.out.println("Produsul a fost sters");
                    break;
                case 10:
                    cosCumparaturi.trimiteComanda();
                    cosCumparaturi.clearListaProduseCos();
            }
        }

    }

}
