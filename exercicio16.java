import java.util.Scanner;

public class exercicio16 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Agora, implemente um programa que leia 4 valores reais (n1, n2, n3 e n4)
        // e escreva os valores lidos em ordem crescente.

        double v1, v2, v3, v4;

        System.out.println("Informe 4 valores reais, eles seram mostrados em ordem crescente:");
        v1 = input.nextDouble();
        v2 = input.nextDouble();
        v3 = input.nextDouble();
        v4 = input.nextDouble();

        double maior = v1;
        if (v2 > maior)
            maior = v2;
        if (v3 > maior)
            maior = v3;
        if (v4 > maior)
            maior = v4;

        double menor = v1;
        if (v2 < menor)
            menor = v2;
        if (v3 < menor)
            menor = v3;
        if (v4 < menor)
            menor = v4;


        System.out.printf("Ordem decrescente: %.1f\n%.1f\n%.1f\n%.1f\n", menor, maior);

        input.close();

    }

}
