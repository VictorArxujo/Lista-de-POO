
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt(); // Define o tamanho do vetor
        int[] vetor = new int[tamanho]; 

        System.out.println("Digite os valores do vetor: ");
        
        for (int i = 0; i < tamanho; i++){
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
