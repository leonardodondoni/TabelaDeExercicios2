import java.util.Scanner;

public class exercicio3 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        //Faça um programa que leia a altura de uma pessoa em metros e o seu
        //sexo (use 1 para feminino e 2 para masculino). A seguir, o programa deve
        //escrever o peso ideal dessa pessoa conforme descrito a seguir:
        //• Para homens, o peso ideal corresponde a 72.7 × altura − 58
        //• Para mulheres, use 62.1 × altura − 44.7

        System.out.println("Informe a altura de uma pessoa em metros: ");
        double altura = teclado.nextDouble();
        System.out.println("Informe o seu sexo, use 1 para feminino e 2 para masculino: ");
        int sexo = teclado.nextInt();

        if(sexo==1){
            double pesoIdealMasculino = 72.7*altura-58;
            System.out.printf("O peso ideal para sua altura é:%.1f", pesoIdealMasculino);

        }else{
            double pesoIdealFeminino = 62.1*altura-44.7;
            System.out.printf("O peso ideal para sua altura é:%.1f", pesoIdealFeminino);
        }

        

        


        
    }

}
