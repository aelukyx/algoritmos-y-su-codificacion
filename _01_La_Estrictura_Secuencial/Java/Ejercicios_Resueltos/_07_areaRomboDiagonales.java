package EstructuraSecuencial;

import java.util.Scanner;

public class _07_areaRomboDiagonales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese diagonales: ");
        System.out.println("Diagonal 1: ");
        float d1 = sc.nextFloat();
        System.out.println("Diagonal 2: ");
        float d2 = sc.nextFloat();
        float c = d1 * d2 / 2;
        System.out.println("Área del rombo: " + c);
        sc.close();
    }
}
