package EjerciciosPropuestosI;

import java.util.Scanner;

public class _02_areaTrapecio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese base menor :");
        float bme = sc.nextFloat();
        System.out.print("Ingrese base mayor :");
        float bma = sc.nextFloat();
        System.out.print("Ingrese base altura :");
        float h = sc.nextFloat();
        float a = h * ((bma + bme) / 2);
        System.out.println("El área del trapecio es : " + a);
        sc.close();
    }
}
