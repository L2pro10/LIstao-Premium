package exercicios;
import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];

        System.out.println("Digite 10 elementos inteiros para o vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            B[i] = 0;
            for (int j = i; j < tamanho; j++) {
                B[i] += A[j];
            }
            System.out.println("B[" + i + "] = " + B[i]);
        }

        ler.close();
    }
}
