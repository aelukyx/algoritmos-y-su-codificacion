package EstructuraSecuencial;

import java.util.Scanner;

public class _09_areaTotalCilindroRecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese radio del cilindro: ");
        float r = sc.nextFloat();
        System.out.print("Ingrese altura del cilindro: ");
        float h = sc.nextFloat();
        double AreaTotalCil = 6.28 * r * (r + h);
        System.out.println("Área pedida : " + AreaTotalCil);
        sc.close();
    }
}
