package exercicios;

import java.util.Scanner;

public class DiferencaConjuntos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho];
        int cIndex = 0;

        System.out.println("Digite 10 elementos inteiros para o vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = ler.nextInt();
        }

        System.out.println("Digite 10 elementos inteiros para o vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = ler.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            boolean found = false;
            for (int j = 0; j < tamanho; j++) {
                if (A[i] == B[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                C[cIndex++] = A[i];
            }
        }

        System.out.print("Diferença (vetor C): ");
        for (int i = 0; i < cIndex; i++) {
            System.out.print(C[i] + " ");
        }

        ler.close();
    }
}
