import java.util.Scanner;

public class anotacoes {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nome1, nome2;

        System.out.print("Informe o nome1: ");
        nome1 = input.nextLine();
        System.out.print("Informe o nome2: ");
        nome2 = input.nextLine();

        System.out.println("Nome1: " + nome1);
        System.out.printf("Nome2: %s\n", nome2);

        // lenght --> devolve a quantidade (int) de caracteres de uma string

        int length_nome1 = nome1.length();
        System.out.println("Comprimento do nome1: " + length_nome1);

        int length_nome2 = nome2.length();
        System.out.println("Comprimento do nome1: " + length_nome2);

        // charAt(int indice) --> devolve o caracter daquele indice

        System.out.println("Primeira letra de nome1: " + nome1.charAt(0));

        char primeiraLetra = nome2.charAt(0);

        System.out.println("Primeira letra do nome2: " + primeiraLetra);

        System.out.println("Segunda letra do nome1: " + nome1.charAt(1));

        System.out.println("Ultima letra do nome2: " + nome2.charAt(length_nome2 - 1));

        // equals --> compara duas strings. Devolve true se elas sao identicas; e false
        // em caso contrário.

        if (nome1.equals(nome2) == true)
            System.out.println("Nomes exatamente iguais");
        else
            System.out.println("Nomes não são exatamente iguais");

        // equalsIgnoreCase --> compara duas string, ignora se é maiscula ou minusuca.
        // verifica só a sequencia dos caracteres.

        if (nome1.equalsIgnoreCase(nome2) == true)
            System.out.println("Mesma sequência de caracteres");
        else
            System.out.println("Nomes diferentes");

        // compareTo --> devolve um inteiro que indica a relação de ordem das strings

        int resultado = nome1.compareTo(nome2);
        if (resultado == 0)
            System.out.println("Nomes exatamente iguais: ");
        if (resultado<0) System.out.println("nome1 vem antes do nome2: " + nome1 + " - " +nome2);
        if (resultado>0) System.out.println("nome1 vem depois do nome2: " + nome2 + " - " +nome1);

        //toLowerCase --> converte a String para minusculo
        //toUpperCase --> converte a String para maiusculo

        String tmp1 = nome1.toLowerCase();
        String tmp2 = nome2.toUpperCase();

        System.out.println("Nome1 em minusculo: " + tmp1);
        System.out.println("Nome2 em maiusculo: " + tmp2);

        input.close();
    }
    

}
