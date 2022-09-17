import java.util.Scanner;

public class exercicio8Lista3 {
    public static void main(String args[]) {

        //Implemente um programa que lê 5 valores inteiros e positivos, calcule e
        //escreva:
        //(a) a média dos valores;
        //(b) o maior deles;
        //(c) o menor deles;
        //(d) a quantidade de valores que estão no intervalo [0;10].

        Scanner input = new Scanner(System.in);
        int cont, valor, soma = 0, maior = 0, menor = Integer.MAX_VALUE, intervalo=0;

        cont = 0;
        while(cont<5){
            System.out.print(cont);
            System.out.print(" - Informe um valor inteiro e positivo:");
            valor = input.nextInt();
            if(valor<=0) System.out.println("Erro - o valor deve ser positivo");
            else{
                cont = cont + 1;
                soma = soma + valor;
                if(valor>maior) maior = valor;
                if(valor<menor) menor = valor;
                if(valor>=0 && valor<=10) intervalo = intervalo + 1;
            }
        }
        System.out.println("Média aritmética: " +(double)soma/cont);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Intervalo: " + intervalo);




    

        }

    }
