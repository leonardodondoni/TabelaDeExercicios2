import java.util.Scanner;
public class exercicio26 {
    public static void main(String args[]){

        // Implemente um programa que leia a representação das cartas de um baralho (valor e naipe) e escreve por extenso o significado da carta. Use C
        //para copas, P para paus, E para espada e O para ouro. Exemplo:
        //(a) entrada: AC, saída: ás de copas
        //(b) entrada: 2P, saída: dois de paus
        //(c) entrada: QE, saida: rainha de espadas

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor e naipe da carta, Use C para copas, P para paus, E para espada e O para ouro, exemplo AC: ás de copas");
        String carta = input.nextLine();

        int valor = carta.charAt(0);
        int naipe = carta.charAt(1);

        switch(valor){
            case 65: System.out.print("Ás de "); break;
            case 50: System.out.print("Dois de "); break;
            case 51: System.out.print("Três de "); break;
            case 52: System.out.print("Quatro de "); break;
            case 53: System.out.print("Cinco de "); break;
            case 54: System.out.print("Seis de "); break;
            case 55: System.out.print("Sete de "); break;
            case 56: System.out.print("Oito de "); break;
            case 57: System.out.print("Nove de "); break;
            case 49: System.out.print("Dez de "); break; 
            case 74: System.out.print("Valete de "); break; 
            case 81: System.out.print("Rainha de "); break; 
            case 75: System.out.print("Rei de "); 
        }

        switch(naipe){
            case 67: System.out.print("copas"); break;
            case 69: System.out.print("espada"); break;
            case 79: System.out.print("ouro"); break;
            case 80: System.out.print("paus");

        }

        input.close();






    }
    
}
