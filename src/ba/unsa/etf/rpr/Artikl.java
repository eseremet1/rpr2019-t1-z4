package ba.unsa.etf.rpr;

public class Artikl {

    private String ime;
    private String broj;
    private int cijena;

    public Artikl() {
        this.ime="";
        this.broj="";
        this.cijena=0;
    }

    public Artikl(String ime1, int cijena1, String broj1) {
        this.ime=ime1;
        this.cijena=cijena1;
        this.broj=broj1;
    }

    String getNaziv() {
        return this.ime;
    }

    int getCijena() {
        return this.cijena;
    }

    String getKod() {
        return this.broj;
    }



}