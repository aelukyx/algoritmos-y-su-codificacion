package EstructuraSecuencial;

import java.util.Scanner;

public class _06_sumaAreasCuadrados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese lado del cuadrado inicial: ");
        float a = sc.nextFloat();
        float s = 2 * a * a;
        System.out.println("La suma de las áreas es: " + s);
        sc.close();
    }
}
