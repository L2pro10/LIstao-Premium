package exercicios;

public class PotenciadDeDois {
    public static void main(String[] args) {
        int tamanho = 11;
        int[] A = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            A[i] = (int) Math.pow(2, i);  // 2 elevado a i
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
