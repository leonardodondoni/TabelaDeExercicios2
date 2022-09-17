import java.util.Scanner;

class sample {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // You are given an integer N where 0 <= N <= 100, followed by another line of
        // input which has a word W with length L where 1 <= L <= 50.
        // Your task is to print N lines with the word W. The lines of your output
        // should not have any trailing or leading spaces
        // Your output lines should not have any trailing or leading whitespaces

        int N = input.nextInt();
        
        String L = input.nextLine();

        if (L.length() > 50) {
            System.out.print("L invalid, please insert a valid word");
            return;
        }

        if (N < 0 || N > 100) {
            System.out.println("N invalid, please insert a valid number");
        }

        if (L.length() > 0) {
            for (int i = 1; i <= N; i++)
                System.out.println(L);
        }

        input.close();

    }
}
