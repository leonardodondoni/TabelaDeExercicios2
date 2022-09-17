import java.util.Scanner;

public class exercicio6Lista3 {
    public static void main(String args[]) {

        int num = 1000;
        System.out.println("\nValores que dividos por 11 tem 5 como resto");

        while (num <= 1999) {
            if(num%11==5) System.out.println(num);
            num = num + 1;

        }

    }

}