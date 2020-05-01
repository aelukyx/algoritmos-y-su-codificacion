package EstructuraSecuencial;

import java.util.Scanner;

public class _10_areaTrianguloInscritoCircun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese lados y radio: ");
        System.out.print("Lado a: ");
        float a = sc.nextFloat();
        System.out.print("Lado b: ");
        float b = sc.nextFloat();
        System.out.print("Lado c: ");
        float c = sc.nextFloat();
        System.out.print("Radio : ");
        float r = sc.nextFloat();
        float area = (a + b + c) * r / 2;
        System.out.println("El área del triangulo es: " + area);
        sc.close();
    }
}
