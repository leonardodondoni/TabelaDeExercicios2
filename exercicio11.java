import java.util.*;

public class exercicio11 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Faça um programa que leia o horário de inicio de um jogo, em horas
        // e minutos, e o horário de fim desse jogo, também em hora e minutos.
        // Sabendo que a duração máxima do jogo é de 24 horas, determine o tempo
        // de duração do jogo em horas e minutos.

        System.out.println("Informe o horário de inicio do jogo em horas:");
        int inicioHoras = input.nextInt();
        System.out.println("Informe o horário de inicio do jogo em minutos:");
        int inicioMinutos = input.nextInt();
        System.out.println("Informe o horário do fim do jogo em horas:");
        int fimHoras = input.nextInt();
        System.out.println("Informe o horário do fim do jogo em minutos:");
        int fimMinutos = input.nextInt();

        if (inicioHoras < 0 || inicioHoras > 24) {
            System.out.println("Informe um horário inicial do jogo válido em horas");
        } else if (inicioMinutos < 0 || inicioMinutos > 60) {
            System.out.println("Informe um horário inicial do jogo válido em minutos");
        } else if (fimHoras < 0 || fimHoras > 24) {
            System.out.println("Informe um horário final do jogo válido em horas");
        } else if (fimMinutos < 0 || fimMinutos > 60) {
            System.out.println("Informe um horário final do jogo válido em minutos");
        }

        inicioMinutos = inicioHoras * 60 + inicioMinutos;
        fimMinutos = fimHoras * 60 + fimMinutos;
        int duracaoTotal;

        if (inicioMinutos < fimMinutos)
            duracaoTotal = fimMinutos - inicioMinutos;
        else {
            duracaoTotal = 24 * 60 - inicioMinutos + fimMinutos;
            System.out.println(duracaoTotal / 60 + " hora(s) " + duracaoTotal % 60 + " minuto(s)");
        }

        input.close();
    }

}
