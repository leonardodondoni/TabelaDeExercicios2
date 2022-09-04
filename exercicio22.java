import java.util.Scanner;

public class exercicio22 {
    public static void main(String args[]){


        //Faça um programa que leia uma quantia inteira em R$ do intervalo [1;9999]
        //(garanta isso) e a escreva por extenso. Por exemplo, se o valor lido for R$
        //315, o programa deve escrever trezentos e quinze reais. Implemente com
        //switch − case, mas não use um case para cada valor possível.
        
        
        Scanner teclado = new Scanner(System.in);
        int valor, resto;
        
        System.out.print("\fInforme uma quantia inteira em R$:");
        valor = teclado.nextInt();
        if(valor<1 || valor>9999) System.out.println("Valor fora do intervalo de [1;9999]");
        else{
            int milhar = valor/1000;
            switch(milhar){
                case 1: System.out.print("Um mil "); break;
                case 2: System.out.print("Dois mil "); break;
                case 3: System.out.print("Três mil "); break;
                case 4: System.out.print("Quatro mil "); break;
                case 5: System.out.print("Cinco mil "); break;
                case 6: System.out.print("Seis mil "); break;
                case 7: System.out.print("Sete mil "); break;
                case 8: System.out.print("Oito mil "); break;
                case 9: System.out.print("Nove mil "); 
            }
            
            resto = valor%1000;
            int centena = resto/100;
            switch(centena){
                case 1: if(resto%100==0) System.out.print("Cem ");
                        else System.out.print("Cento ");
                        break;
                case 2: System.out.print("Duzentos "); break;
                case 3: System.out.print("Trezentos "); break;
                case 4: System.out.print("Quatrocentos "); break;
                case 5: System.out.print("Quinhetos "); break;
                case 6: System.out.print("Seiscentos "); break;
                case 7: System.out.print("Setecentos "); break;
                case 8: System.out.print("Oitocentos "); break;
                case 9: System.out.print("Novecentos ");
            }
            
            resto = resto % 100;
            int dezena = resto/10;
                switch(dezena){
                case 1: if(resto%10==0) System.out.print("Dez ");
                else System.out.print("Cento ");System.out.print("Dez "); break;
                case 2: System.out.print("Vinte "); break;
                case 3: System.out.print("Trinta "); break;
                case 4: System.out.print("Quarenta "); break;
                case 5: System.out.print("Cinquenta "); break;
                case 6: System.out.print("Sessenta "); break;
                case 7: System.out.print("Setenta "); break;
                case 8: System.out.print("Oitenta "); break;
                case 9: System.out.print("Noventa ");
                
                
            }
            
            int unidade = resto%10;
            switch(unidade){

                case 1: if(dezena==1 && unidade==1)System.out.print("onze"); break;
                case 2: System.out.print("dois"); break;
                case 3: System.out.print("três"); break;
                case 4: System.out.print("quatro"); break;
                case 5: System.out.print("cinco"); break;
                case 6: System.out.print("seis"); break;
                case 7: System.out.print("sete"); break;
                case 8: System.out.print("oito"); break;
                case 9: System.out.print("nove"); 
                
            }
        }
          


        }
    }


