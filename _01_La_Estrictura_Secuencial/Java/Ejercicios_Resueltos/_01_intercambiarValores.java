package EstructuraSecuencial;

import java.util.Scanner;

public class _01_intercambiarValores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, t;
        System.out.print("Ingrese a: ");
        a = sc.nextInt();
        System.out.print("Ingrese b: ");
        b = sc.nextInt();
        t = a;
        a = b;
        b = t;
        System.out.println("Los valores intercambiados son: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
    }
}
