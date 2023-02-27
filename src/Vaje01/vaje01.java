package Vaje01;

public class vaje01 {
    public static void main(String[] args) {
        pravokotnikStevil(7, 3);
        System.out.println();
        pravokotnik(5,7,3);
        System.out.println();
        trikotnikStevil(3);
        System.out.println();
        trikotnikStevilObrnjen(5);
        System.out.println();
        trikotnik(3,3);
        System.out.println();
        trikotnikObrnjen(3,3);
        System.out.println();
        romb(3,3);
        System.out.println();
        smreka(3);
    }

    private static void pravokotnikStevil(int sirina, int visina) {
        for(int i = 1; i <= visina; i++) {
            for(int j = 0; j <= sirina; j++) {
                System.out.print(j); // za a) izpišemo i za b) pa j
            }
            System.out.println();
        }
    }
    private static void pravokotnik(int odmik, int sirina, int visina) {

        for(int i = 1; i <= visina; i++) {
            for(int k = 0; k < odmik; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= sirina; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    private static void trikotnikStevil(int visina) {
        for(int i = 1; i <= visina; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i); // za a) izpišemo i za b) pa j
                            }
            System.out.println();
        }
    }

    private static void trikotnikStevilObrnjen(int visina) {
        for(int i = visina; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i); // za a) izpišemo i za b) pa j

            }
            System.out.println();
        }
    }

    private static void trikotnik(int visina, int odmik) {
        for(int i = 1; i <= visina; i++) {
            for(int k = 0; k < odmik - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print(j); //"*" za f) primer

            }
            System.out.println();
        }
    }

    private static void trikotnikObrnjen(int odmik, int visina) {
        for(int i = visina; i >= 0; i--) {
            for(int k = 0; k < odmik - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*"); // za a) izpišemo i za b) pa j

            }
            System.out.println();
        }
    }

    private static void romb(int odmik, int velikost) {
        trikotnik(odmik,velikost);
        trikotnikObrnjen(odmik+1, velikost-1);
    }

    private static void smreka(int velikost) {
        for(int i = 0; i < velikost; i++) {
            trikotnik(2 * i + 2, 5);
        }
        int sirina = velikost;
        if(velikost % 2 == 0) sirina += 1;
        pravokotnik(odmik, sirina, visina);
    }
}
