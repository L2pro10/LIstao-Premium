package exercicios;

import java.util.Scanner;
public class ParesAte0{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int i, j;
        
        System.out.println("Digite 10 elementos inteiros para o vetor A:");
        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        for (i = 0; i < 10; i++) {
            int valor = A[i];
            System.out.println("Elemento A[" + i + "] = " + valor);
            System.out.print("Pares de 0 até " + valor + ": ");
            for (j = 0; j <= valor; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
