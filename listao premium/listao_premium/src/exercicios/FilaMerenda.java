package exercicios;
import java.util.Scanner;

public class FilaMerenda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] fila = new int[10];
        int posicao = 0;

        System.out.println("Digite 10 números de senhas para a fila:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Senha " + (i + 1) + ": ");
            fila[i] = ler.nextInt();
        }

        System.out.println("Fila da merenda:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Senha " + fila[i]);
        }

        ler.close();
    }
}
