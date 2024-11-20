/*
 * public class Saida {
public static void main(String arg[]){
System.out.println(“Facim, facim!!!");
}
}
Exerc: Usando o modelo anterior:
a.1)_Acrescente mais uma linha de exibição no programa anterior. 
a.2)_Crie um programa que imprima todos os seus dados cadastraisa.
3)_Crie um programa que imprima a frase “Meu nome é: ” que atravésdeparâmetros passados durante a chamada (interpretação: java ...) doprograma, imprima na tela esta frase + o nome passado.
 */
/* 

public class Saida {
    public static void main(String arg[]){
    System.out.println("Facim, facim!!!");    
    }
}

*/
// 1)_Acrescente mais uma linha de exibição no programa anterior. 
/* 
public class Saida {
    public static void main(String arg[]){
    System.out.println("Facim, facim!!!");    
    System.out.println("\nfacim, teste");
    }
}
*/
// 2)_Crie um programa que imprima todos os seus dados cadastraisa.
/*
public class Saida {
    public static void main(String arg[]){
    String a = "victor";
    String b = "Rua das amizades, n: 28";
    int cpf = 5402012;
    System.out.println("Nome" + a);    
    System.out.println("\ncpf: " + cpf);
    System.out.println("\nEndereço" + b);    
    
    }
}
 */
//a.3)_Crie um programa que imprima a frase “Meu nome é: ” que atravésdeparâmetros passados durante a chamada (interpretação: java ...) doprograma, imprima na tela esta frase + o nome passado.

public class Saida {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Meu nome é: " + args[0]);
        } else {
            System.out.println("Nenhum nome foi passado como parâmetro!");
        }
    }
}
