package exercicios;
public class Fatoriais {
    public static void main(String[] args) {
        int tamanho = 15;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            B[i] = fatorial(A[i]);
            System.out.println("A[" + i + "] = " + A[i] + " | B[" + i + "] (fatorial) = " + B[i]);
        }
    }

    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
