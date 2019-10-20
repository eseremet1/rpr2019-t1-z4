package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] u_korpi;
    int br_u_korpi;

    public Korpa() {
        u_korpi=new Artikl[50];
        br_u_korpi=0;
    }
    Artikl[] getArtikli() {
        return u_korpi;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<br_u_korpi; i++) {
            if(u_korpi[i].getKod() == kod) {
                Artikl za_izbaciti=u_korpi[i];
                for(int j=i; j<br_u_korpi-1; j++) {
                    u_korpi[j]=u_korpi[j+1];
                }
                u_korpi[br_u_korpi-1] = null;
                br_u_korpi--;
                return za_izbaciti;
            }
        }
        return null;
    }

    int dajUkupnuCijenuArtikala() {
        int ukupna_cijena=0;
        for(int i=0; i<br_u_korpi; i++)
            ukupna_cijena=ukupna_cijena+u_korpi[i].getCijena();

        return ukupna_cijena;
    }

    public boolean dodajArtikl(Artikl za_dodati) {
        if(za_dodati==null) return false;

        u_korpi[br_u_korpi]=za_dodati;
        br_u_korpi++;
        return true;
    }


}