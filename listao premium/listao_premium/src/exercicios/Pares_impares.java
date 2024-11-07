package exercicios;
import java.util.Scanner;
public class Pares_impares {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int[] B = new int[20];
	        int pares = 0;
	        int Impares = 10;
	        int[] A = new int[20];
	        int i;

	        System.out.println("Digite 20 números para o vetor A:");
	        for (i=0; i<20; i++) {
	            A[i] = ler.nextInt();
	        }

	        for (i=0; i<20; i++) {
	            if (A[i] % 2 == 0) {
	                B[pares] = A[i];
	                pares++;
	            } else {
	                B[Impares] = A[i];
	                Impares++;
	            }
	        }

	        System.out.println("Vetor B com numeros pares seguidos de ímpares:");
	        for (i=0; i<20; i++) {
	            System.out.print(B[i] + " ");
	        }
	    }
	}


