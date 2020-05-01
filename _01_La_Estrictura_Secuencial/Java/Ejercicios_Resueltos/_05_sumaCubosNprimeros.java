package EstructuraSecuencial;

import java.util.Scanner;

public class _05_sumaCubosNprimeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de términos: ");
        int n = sc.nextInt();
        int s = n * n * (n + 1) * (n + 1) / 4;
        System.out.println("Suma de los cubos de los n primeros términos: " + s);
        sc.close();
    }
}
