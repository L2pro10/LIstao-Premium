package exercicios;
import java.util.Scanner;
public class Numeros_primos {
	    public static boolean isPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int i;
	        int[] A = new int[10];

	        System.out.println("Digite 10 números inteiros:");
	        for (i = 0; i < 10; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            A[i] = ler.nextInt();
	        }

	        System.out.println("\nVerificação de números primos:");
	        for (i = 0; i < 10; i++) {
	            int numero = A[i];
	            if (isPrimo(numero)) {
	                System.out.println("O número " + numero + " é primo.");
	            } else {
	                System.out.println("O número " + numero + " NÃO é primo.");
	            }
	        }

	        ler.close();
	    }
	}

