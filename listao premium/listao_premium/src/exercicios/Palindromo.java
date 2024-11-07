package exercicios;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] A = new int[tamanho];

        System.out.println("Digite 10 elementos inteiros para o vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = ler.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < tamanho / 2; i++) {
            if (A[i] != A[tamanho - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }

        ler.close();
    }
}
