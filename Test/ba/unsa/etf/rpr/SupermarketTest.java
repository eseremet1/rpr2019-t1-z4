package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {


    }

    @Test
    void izbaciArtiklSaKodom() {
    }

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Amina", 1000, "Elma"));
        Artikl[] artikli = supermarket.getArtikli();
        assertNotNull(artikli[0]);

    }


}