package EstructuraSecuencial;

import java.util.Scanner;

public class _08_volumenCilindroRecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese radio del cilindro: ");
        float r = sc.nextFloat();
        System.out.print("Ingrese altura del cilindro: ");
        float h = sc.nextFloat();
        double VolCilindro = 3.14159 * r * r * h;
        System.out.println("El volumen es : " + VolCilindro);
        sc.close();
    }
}
