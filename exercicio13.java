import java.util.Scanner;
public class exercicio13 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        //13. Faça um programa que leia um número inteiro de 4 digitos (garanta isso).
        //A seguir, seu programa deve verificar se o número lido possui a mesma característica que o número 3025. O programa deve escrever uma mensagem
        //indicando ou não se o valor lido possui a característica mostrada.

        //30 + 25 = 55
        //55² = 3025

        int n1;

        System.out.println("Informe um número inteiro de 4 digitos, a seguir o programa ira verificar se o número informado possui a mesma característica que número 3025\n30 + 25 = 55 55² = 3025, o programa informará se o valor possui ou não.");
        n1 = input.nextInt();

        if(n1>9999 || n1<1000){
            System.out.println("Informe um número válido");
        }

        int parte1 = n1/100;
        int parte2 = n1%100;
        int resultado= parte1+parte2;

        if(resultado*resultado==n1){
            System.out.println("O valor informado possui a mesma característica que o número 3025");
        }
        else System.out.println("O valor informado não possui a mesma característica que o número 3025");

        input.close();

        


    }
    
}
