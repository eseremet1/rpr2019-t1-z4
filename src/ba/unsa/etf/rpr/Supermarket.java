package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] u_supermarketu;
    int br_u_supermarketu;

    public Supermarket() {
        u_supermarketu=new Artikl[1000];
        br_u_supermarketu=0;
    }


    Artikl[] getArtikli() {
        return u_supermarketu;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<br_u_supermarketu; i++) {
            if(u_supermarketu[i].getKod() == kod) {
                Artikl za_izbaciti=u_supermarketu[i];
                for(int j=i; j<br_u_supermarketu-1; j++) {
                    u_supermarketu[j]=u_supermarketu[j+1];
                }
                u_supermarketu[br_u_supermarketu-1] = null;
                br_u_supermarketu--;
                return za_izbaciti;
            }
        }
        return null;
    }

    public void dodajArtikl(Artikl za_dodati) {
        u_supermarketu[br_u_supermarketu]=za_dodati;
        br_u_supermarketu++;
    }


}