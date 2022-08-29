import java.util.Scanner;

public class exercicio10 {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        // Elabore um programa que leia uma nota do intervalo [0; 10] (garanta isso),
        // verifique e escreva o conceito correspondente conforme a tabela abaixo:
        // nota conceito
        // 9 a 10 A
        // 7 a 8,9 B
        // 5 a 6,9 C
        // 3 a 4,9 D
        // abaixo de 3 E

        System.out.println("Informe uma nota do intervalo [0; 10]:");
        double notaDoIntervalo = teclado.nextDouble();

        if (notaDoIntervalo > 10.0) {
            System.out.println("Informe uma nota do intervalo [0; 10], por favor.");
        }
        if (notaDoIntervalo > 8.9 && notaDoIntervalo < 10.0) {
            System.out.println("Sua nota conceito é: A");
        }
        if (notaDoIntervalo > 6.9 && notaDoIntervalo < 9.0) {
            System.out.println("Sua nota conceito é: B");
        }
        if (notaDoIntervalo > 4.9 && notaDoIntervalo < 7.0) {
            System.out.println("Sua nota conceito é: C");
        }
        if (notaDoIntervalo > 2.9 && notaDoIntervalo < 5.0) {
            System.out.println("Sua nota conceito é: D");
        }
        if (notaDoIntervalo < 3.0) {
            System.out.println("Sua nota conceito é: F");
        }

        teclado.close();

    }

}
