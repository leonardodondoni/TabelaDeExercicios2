import java.util.Scanner;

public class exercicio16 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Agora, implemente um programa que leia 4 valores reais (v1, n2, n3 e n4)
        // e escreva os valores lidos em ordem crescente.

        double v1, v2, v3, v4;

        System.out.println("Informe 4 valores reais, eles seram mostrados em ordem crescente:");
        v1 = input.nextDouble();
        v2 = input.nextDouble();
        v3 = input.nextDouble();
        v4 = input.nextDouble();

        double aux;

        if (v2 < v1) {
            aux = v1;
            v1 = v2;
            v2 = aux;
        }
        if (v3 < v1) {
            aux = v1;
            v1 = v3;
            v3 = aux;
        }
        if (v4 < v1) {
            aux = v1;
            v1 = v4;
            v4 = aux;
        }
        if (v3 < v2) {
            aux = v2;
            v2 = v3;
            v3 = aux;
        }
        if (v4 < v2) {
            aux = v2;
            v2 = v4;
            v4 = aux;
        }
        if (v4 < v3) {
            aux = v3;
            v3 = v4;
            v4 = aux;
        }

        System.out.printf("Ordem crescente: %.1f\n%.1f\n%.1f\n%.1f\n", v1, v2, v3, v4);

        input.close();

    }

}