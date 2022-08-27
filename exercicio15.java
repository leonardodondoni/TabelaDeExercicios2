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
        double v1 = input.nextDouble();
        System.out.println("Informe o segundo número: ");
        double v2 = input.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double v3 = input.nextDouble();

        System.out.println(
                "Selecione uma opção: \n[1] O programa deve escrever os valores em ordem crescente.\n[2]O programa deve escrever os valores em ordem decrescente.\n[3]o maior deve ser escrito entre os demais.");
        int opcao = input.nextInt();

        if (opcao < 1 || opcao > 3) {
            System.out.println("Informe uma opção válida");
        }

        double maior, meio, menor;

        maior = v1;
        if (v2 > maior)
            maior = v2;
        if (v3 > maior)
            maior = v3;

        menor = v1;
        if (v2 < menor)
            menor = v2;
        if (v3 < menor)
            menor = v3;

        meio = v1;
        if (menor == v1 && maior == v3)
            meio = v2;
        if (menor == v1 && maior == v2)
            meio = v3;

        if (opcao == 1) {
            System.out.printf("Ordem crescente: %.1f %.1f %.1f", menor, meio, maior);
        }
        if (opcao == 2) {
            System.out.printf("Ordem decrescente: %.1f %.1f %.1f", maior, meio, menor);
        }
        if (opcao == 3) {
            System.out.printf("O maior número é: %.1f", maior);
        }

    }

}
