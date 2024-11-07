package exercicios;
import java.util.Scanner;

public class ComparacaoVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho];

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
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        ler.close();
    }
}
