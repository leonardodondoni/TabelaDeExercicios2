import java.util.*;

public class exercicio15 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um valor
        // inteiro (opcao). O programa deve escrever os valores n1, n2 e n3 em uma
        // determinada ordem, a qual é definida pelo valor de opcao.
        // (a) Se opcao for 1, o programa deve escrever os valores em ordem crescente.
        // (b) Se opcao for 2, o programa deve escrever os valores em ordem decrescente.
        // (c) Se opcao for 3, o maior deve ser escrito entre os demais

        System.out.println("Informe o primeiro número: ");
        double n1 = input.nextDouble();
        System.out.println("Informe o segundo número: ");
        double n2 = input.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double n3 = input.nextDouble();

        System.out.println(
                "Selecione uma opção: \n[1] O programa deve escrever os valores em ordem crescente.\n[2]O programa deve escrever os valores em ordem decrescente.\n[3]o maior deve ser escrito entre os demais.");
        int opcao = input.nextInt();

        if (opcao < 1 || opcao > 3) {
            System.out.println("Informe uma opção válida");
        }

        double aux;

        if(n2<n1){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if(n3<n1){
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if(n3<n2){
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        

        if (opcao == 1) {
            System.out.printf("Ordem crescente: %.1f %.1f %.1f", n1, n2, n3);
        }
        if (opcao == 2) {
            System.out.printf("Ordem decrescente: %.1f %.1f %.1f", n3, n2, n1);
        }
        if (opcao == 3) {
            System.out.printf("O maior número é: %.1f", n3);
        }

        input.close();

    }

}