/*
 * G1)_ Construa um programa que:
I) Permita o usuário entrar com 2 valores (que sejam armazenados emduas variáveis, porexemplo, “a” e “b”);
II)_ Apresente “menu de opções” com 4 opções:
Exemplo:
Menu de Opções:
1 – Somar (a+b)
2 – multiplicar (a*b)
3 - subtrair (a-b)
5 – dividir (a/b)
Escolha uma opção:
III)_ Após o usuário escolher uma opção, apareça uma linha informando o resultadodocálculo que foi escolhido:
Exemplo (sendo escolhida a 1ª opção e “a” valendo 2 e “b” valendo 1):
“A soma de a + b é: 3”
Para tanto use as estruturas de entrada de dados via console, conversão de tiposeaestrutura de seleção switch..case
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {
    public static void main(String[] args) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        String s = ""; 
        String t = ""; 
        int opcao = -1;

        System.out.println("Entre com o 1º valor: ");

        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }

        System.out.println("Entre com o 2º valor: ");

        try {
            t = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }

        float valor1 = Float.parseFloat(s);
        float valor2 = Float.parseFloat(t);

        do {
            System.out.println("==== Menu ====");
            System.out.println("1. Somar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Subtrair");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                String entrada = cd.readLine();
                opcao = Integer.parseInt(entrada);

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da soma: " + (valor1 + valor2));
                        break;

                    case 2:
                        System.out.println("Resultado da multiplicação: " + (valor1 * valor2));
                        break;

                    case 3:
                        System.out.println("Resultado da subtração: " + (valor1 - valor2));
                        break;

                    case 4:
                        if (valor2 != 0) {
                            System.out.println("Resultado da divisão: " + (valor1 / valor2));
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;

                    case 5:
                        System.out.println("Saindo... Até mais!");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            } catch (IOException e) {
                System.out.println("Erro de entrada");
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }

        } while (opcao != 5);
    }
}