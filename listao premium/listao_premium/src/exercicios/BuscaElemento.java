package exercicios;
import java.util.Scanner;

public class BuscaElemento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] A = new int[tamanho];

        System.out.println("Digite 10 elementos inteiros para o vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = ler.nextInt();
        }

        System.out.print("Digite o valor a ser buscado: ");
        int X = ler.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (A[i] == X) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Elemento " + X + " encontrado no vetor.");
        } else {
            System.out.println("Elemento " + X + " não encontrado no vetor.");
        }

        ler.close();
    }
}
