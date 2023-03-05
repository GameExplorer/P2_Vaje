package Vaje01;

import static Vaje01.Trikotnik.trikotnik;
import static Vaje01.Trikotnik.trikotnikObrnjen;

public class Romb {
    public static void main(String[] args) {
        romb(5,3);
    }

    private static void romb(int odmik, int velikost) {
        trikotnik(odmik,velikost);
        trikotnikObrnjen(odmik+1, velikost-1); //ali spodnjemu ali zgornjemu odštejem velikost -1
    }
}

