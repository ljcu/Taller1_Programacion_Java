package setdetenis;

import java.util.Scanner;

public class SetDeTenis {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingrese el numero de juegos ganados por el jugador A");
        int n = texto.nextInt();
        System.out.println("Ingrese el numero de juegos ganados por el jugador B");
        int m = texto.nextInt();
        if (m < 6 && n < 6) {
            System.out.println("El set todavía no termina");
        } else if (Math.abs(m - n) < 2) {
            System.out.println("El resultado es invalido");
        } else if (m == 6 && n < 5) {
            System.out.println("B gano el set");
        } else if (n == 6 && m < 5) {
            System.out.println("A gano el set");
        } else if (m == 7 && n == 5) {
            System.out.println("B gano el set");
        } else if (n == 7 && m == 5) {
            System.out.println("B gano el set");
        } else if (m == 7 && n == 6) {
            System.out.println("B gano el set");
        } else if (n == 7 && m == 6) {
            System.out.println("A gano el set");
        } else {
            System.out.println("El resultado es inválido");
        }
    }

}
