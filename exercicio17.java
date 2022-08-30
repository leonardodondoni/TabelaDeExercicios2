import java.util.Scanner;

public class exercicio17 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Faça um programa que leia 5 valores reais, calcula e escreve a média desses
        // valores conforme descrito a seguir:
        // (a) descarta o maior e o menor valor, calcula a média dos valores restantes.
        // (b) descarta os dois menores valores, calcula a média dos valores restantes.

        double n1, n2, n3, n4, n5;

        System.out.println(
                "Informe 5 valores reais, o programa escreverá a média desses valores conforme o descrito a seguir:\n[A]descarta o maior e o menor valor, calcula a média dos valores restantes.\n[B]descarta os dois menores valores, calcula a média dos valores restantes.");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();
        n5 = input.nextDouble();

        double maior, menor;

        maior = n1;
        if (n2 > maior)
            maior = n2;
        if (n3 > maior)
            maior = n3;
        if (n4 > maior)
            maior = n4;
        if (n5 > maior)
            maior = n5;

        menor = n1;
        if (n2 < menor)
            menor = n2;
        if (n3 < menor)
            menor = n3;
        if (n4 < menor)
            menor = n4;
        if (n5 < menor)
            menor = n5;

        double mediaSemMenorEMaior = (n1 + n2 + n3 + n4 + n5 - maior - menor) / 3;

        double aux;

        if (n2 > n1) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n3 > n1) {
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if (n4 > n1) {
            aux = n1;
            n1 = n4;
            n4 = aux;

        }
        if (n5 > n1) {
            aux = n1;
            n1 = n5;
            n5 = aux;

        }
        if (n3 > n2) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if (n4 > n2) {
            aux = n2;
            n2 = n4;
            n4 = aux;
        }
        if (n5 > n2) {
            aux = n2;
            n2 = n5;
            n5 = aux;
        }
        if (n4 > n3) {
            aux = n3;
            n3 = n4;
            n4 = aux;
        }
        if (n5 > n3) {
            aux = n3;
            n3 = n5;
            n5 = aux;
        }
        if (n5 > n4) {
            aux = n4;
            n4 = n5;
            n5 = aux;
        }

        double mediaSemOs2Menores = (n1 + n2 + n3) / 3;

        System.out.println("Média sem o menor e o maior: " + mediaSemMenorEMaior);
        System.out.println("Média sem os 2 menores: " + mediaSemOs2Menores);

        input.close();

    }

}
