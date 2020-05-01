
package EstructuraSecuencial;

import java.util.Scanner;

public class _03_sumaNprimerosNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de términos: ");
        int n = sc.nextInt();
        int s = n * (n + 1)/2;
        System.out.println("Suma de los n primeros términos: " + s);
        sc.close();
    }
}
