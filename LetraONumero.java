package letraonumero;

import java.util.Scanner;


public class LetraONumero {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un caracter: ");
        char caracter = input.next().charAt(0);

        if (Character.isLetter(caracter)) {
            if (Character.isUpperCase(caracter)) {
                System.out.println("El caracter es una letra mayúscula");
            } else {
                System.out.println("El caracter es una letra minúscula");
            }
        } else if (Character.isDigit(caracter)) {
            System.out.println("El caracter es un número");
        } else {
            System.out.println("El caracter no es ni letra ni número");
        }
    }
    
}
