package EstructuraSecuencial;

import java.util.Scanner;

public class _02_apretonesMano {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de personas: ");
        int n = sc.nextInt();
        int a = n*(n-1)/2;
        System.out.println("Número de apretones de mano: " + a);
        sc.close();
    }
}
