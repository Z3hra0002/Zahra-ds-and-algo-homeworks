package evtapsiriqlari;

import java.util.Scanner;

public class sual20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eded daxil et: ");
        int eded = input.nextInt();

        int cem = 0;

        while (eded != 0) {
            cem += eded % 10;
            eded /= 10;
        }

        System.out.println("Reqemlerin cemi: " + cem);

        input.close();
    }
}