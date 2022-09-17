import java.util.Scanner;
public class exercicio9tabela3 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia dois valores inteiros e positivos ’a’ e ’b’. A
        //seguir, o programa deve escrever a soma dos pares entre ’a’ e ’b’ (inclusive).

        System.out.println("Informe dois valores inteiros e positivos, o programa deve escrever a soma dos pares entre eles");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a<1 || b<1)
        System.out.println("Informe um número inteiro e positivo");

        int intervalo = 0;

        while(a+b>0){
        if(a>0 && b<Integer.MAX_VALUE) intervalo = intervalo + 1;

        System.out.println(intervalo);
        }
        
    }

}


    

