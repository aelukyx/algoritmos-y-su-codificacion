package EjerciciosPropuestosI;

import java.util.Scanner;

public class _01_longitudCircunferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese radio:  ");
        float r = sc.nextFloat();
        float l = 2 * 3.141592f * r;
        System.out.println("La longitud de la circunferencia es: " + l);
        sc.close();
    }
}
