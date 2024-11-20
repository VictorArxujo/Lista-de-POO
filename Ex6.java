/*
 * public class Selec1 {
public static void main(String arg[]){
int a=0, b=20;
for(a=0; a<=b; a++){
if(a==(b/2)){
System.out.println(“A é igual a metade de B, logo A vale: "+a+" e B vale: "+b);
}
else if(a!=(b/2)){
 System.out.println(“A é diferente a metade de B, logo A vale: "+a+" e B vale: "+b);}
}
}
}
Exerc: Usando o modelo anterior:
f.1)_ Construa um programa que leia 2 valores inteiros e diga se o 1º é: maior, igual oumenorqueo2º valor
 */

public class Ex6 {
    public static void main(String arg[]){
       
        int a=12, b=20;
        
        if( a >= b ){
            System.out.println("A é Maior que B : " +a);
        }else{
            System.out.println("B é Maior que A : " +b);
        }
    }
}