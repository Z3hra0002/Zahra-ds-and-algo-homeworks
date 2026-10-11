package evtapsiriqlari;

import java.util.Scanner;

public class sual15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n ededini daxil et: ");
        int n = input.nextInt();

        long faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial: " + faktorial);

        input.close();
    }
}