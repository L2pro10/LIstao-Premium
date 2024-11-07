package exercicios;
import java.util.Scanner;
public class tabuada {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] A = new int[5];
	        int i, j;
	        
	        System.out.println("Digite 5 números inteiros para o vetor A:");

	        for (i = 0; i < 5; i++) {
	            A[i] = scanner.nextInt();
	        }

	        for (i = 0; i < 5; i++) {
	            System.out.println("\nTabuada do " + A[i] + ":");
	            for (j = 1; j <= 10; j++) {
	                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
	            }
	        }
	    }
	}


