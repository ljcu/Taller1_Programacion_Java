package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        int dividendo = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int divisor = sc.nextInt();
        int cociente = dividendo / divisor;
        int resto = dividendo % divisor;
        if(resto == 0){
            System.out.println("La division es exacta");
        }else{
            System.out.println("La division no es exacta");
        }
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }

}
