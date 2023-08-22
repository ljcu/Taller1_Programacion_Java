package edad;

import java.time.LocalDate;
import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate fechaActual = LocalDate.now();

        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Anno: ");
        int anno = sc.nextInt();

        int edad = fechaActual.getYear() - anno;

        if (fechaActual.getMonthValue() < mes || (fechaActual.getMonthValue() == mes && fechaActual.getDayOfMonth() < dia)) {
            edad--;
        }

        System.out.println("Usted tiene " + edad + " annos");
    }
}
