import java.util.Scanner;

public class exercicio6 {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        // Implemente um programa que leia o saldo médio de uma conta corrente,
        // calcule e escreve o seu limite conforme a tabela abaixo.
        // Saldo Médio Limite
        // menor que R$ 500,00 não há limite
        // de R$ 500,00 a R$ 1.000,00 8% do saldo médio
        // maior ou igual a R$ 1.000,00 15% do saldo médio

        System.out.println("Informe o saldo médio de uma conta corrente:");
        double saldoMedio = teclado.nextDouble();

        if (saldoMedio < 500) {
            double limite = 0;
            System.out.printf("Seu limite é de: R$ %.1f", limite);
        }
        if (saldoMedio > 500 && saldoMedio < 1000) {
            double limite = 8.0 / 100 * saldoMedio;
            System.out.printf("Seu limite é de: R$ %.1f", limite);
        }
        if (saldoMedio >= 1000) {
            double limite = 15.0 / 100 * saldoMedio;
            System.out.printf("Seu limite é de: R$ %.1f", limite);
        }

    }

}
