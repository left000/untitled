package esercizi;

public class Esercizio3 {

    public static int fattoriale_iterativo(int n){
        if (n < 0 ) {
            System.out.println("ERRORE, input negativo");
            return -1;
        }
        int fact= 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
//            fact *= i;
        }
        return fact;
    }
}
