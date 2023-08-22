package ordenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.print("Números ordenados de menor a mayor: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

}
