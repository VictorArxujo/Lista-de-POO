/*
 * I1)_ Construa um programa que 
 * permita ao usuário entrar comdeterminadafrase,
 *  depois permita “escolher” uma letra qualquer e:
 *  casoaletraescolhidaesteja na frase (seja maiúscula ou minúscula)
 *  diga quantas vezeselaapareceu e em que posição da frase. 
 *  Senão, apareça uma fraseinformandoque esta letra não existe na frase.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Entre com uma frase: ");
        String frase = ""; // Para armazenar a frase
        String letraEscolhida = ""; // Para armazenar a letra
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        try {
            frase = cd.readLine(); // Lê a frase
            System.out.println("Você digitou a frase: " + frase);
        } catch (IOException e) {
            System.out.println("Erro de entrada.");
            return;
        }

        System.out.println("Digite uma letra: ");
        try {
            letraEscolhida = cd.readLine(); // Lê a letra
        } catch (IOException e) {
            System.out.println("Erro de entrada.");
            return;
        }

    
        if (letraEscolhida.length() != 1) {
            System.out.println("Por favor, insira apenas uma única letra.");
            return;
        }

        char letra = letraEscolhida.charAt(0); // Extrai a letra como um caractere
        System.out.println("Você digitou a letra: " + letra);

        // Encontrar as posições da letra na frase
        boolean encontrou = false;
        System.out.println("Posições da letra '" + letra + "' na frase:");

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) { // Comparação sensível a maiúsculas/minúsculas
                System.out.println("Posição: " + (i + 1)); // Mostra posições começando em 1
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("A letra '" + letra + "' não foi encontrada na frase.");
        }
    }
}

