/*
 * public class Laco3 {
public static void main(String arg[]){
int a=0, b=15;
do{
System.out.println("O valor de A dentro do DO é: "+a);a++;
}while(a<=b);
System.out.println("");
}
}
Exerc: Usando o modelo anterior:
e.1)_ Da mesma forma que implementou o exercício c.1,
implemente o e.1 usando a estrutura de repetição“do..while
 */
public class Ex5 {
    public static void main(String arg[]){
        int a=0, b=15;
        do{
            b--;
            System.out.println("O valor de b dentro do DO é: "+b);
        }while(b>a);

    }   
}
