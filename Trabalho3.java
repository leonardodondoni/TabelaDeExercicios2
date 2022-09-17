import java.util.Scanner;

public class Trabalho3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int idade = 0, quantidadeGrupos = 0, tempoDiárioMinutos = 0, quantidadeAlunosDesejados = 0, count = 1,
                alunoQueUsaMaisde1Hora = 0, somaIdade = 0, maiorTempo = 0, maisGrupos = 0,
                alunoQueParticipaDeMaisGrupos = 0;

        System.out.println("Quantidade de alunos que deseja validar: ");
        quantidadeAlunosDesejados = input.nextInt();

        for (count = 1; count <= quantidadeAlunosDesejados; count++) {
            System.out.printf("Aluno %d tem quantos anos?\n", count);
            idade = input.nextInt();
            if (idade < 1 || idade > 120) {
                System.out.println("Idade inválida");
                return;
            }
            System.out.printf("Aluno %d - está em quantos grupos?\n", count);
            quantidadeGrupos = input.nextInt();
            if (quantidadeGrupos < 1) {
                System.out.println("Quantidade de grupos inválida");
                return;
            }
            System.out.printf("Aluno %d - Qual o tempo diário de uso em minutos?\n", count);
            tempoDiárioMinutos = input.nextInt();
            if (tempoDiárioMinutos < 1) {
                System.out.println("Tempo de uso diário inválido");
                return;
            }

            somaIdade = somaIdade + idade;

            if (tempoDiárioMinutos > 60)
                alunoQueUsaMaisde1Hora++;

            if (tempoDiárioMinutos > maiorTempo)
                maiorTempo = tempoDiárioMinutos;

            if (quantidadeGrupos > maisGrupos) {
                maisGrupos = quantidadeGrupos;
                alunoQueParticipaDeMaisGrupos = idade;
            }

        }

        System.out.printf(
                "Percentual de alunos que usam o WhatsApp por mais de uma hora ao dia para estudar: %.1f porcento.\n",
                (alunoQueUsaMaisde1Hora * 100.0) / quantidadeAlunosDesejados);

        System.out.printf("Idade média dos alunos: %.1f anos.\n",
                (somaIdade / Double.valueOf(quantidadeAlunosDesejados)));

        System.out.printf(
                "Maior tempo (em hora e minuto) gasto no WhatsApp por um aluno para estudar: %d hora(s) e %d minutos.\n", (maiorTempo / 60), (maiorTempo % 60));

        System.out.printf("Idade do aluno que participa de mais grupos: %d anos.", alunoQueParticipaDeMaisGrupos);

    }

}
