package exercicios;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int  i, valor, j;

        System.out.println("Digite 10 elementos inteiros para o vetor A:");
        for (i=0; i<10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = ler.nextInt();
        }

        for (i=0;i<10; i++) {
            valor = A[i];
            System.out.print("Elemento A[" + i + "] = " + valor);
            System.out.print(" | Divisores: ");
            for (j=1; j<=valor; j++) {
                if (valor % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }

        ler.close();
    }
}
