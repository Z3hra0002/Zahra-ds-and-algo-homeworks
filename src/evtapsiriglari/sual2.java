package evtapsiriqlari;

import java.util.Scanner;

public class sual2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci ededi daxil et: ");
        int a = input.nextInt();

        System.out.print("Ikinci ededi daxil et: ");
        int b = input.nextInt();

        System.out.println("Cem: " + (a + b));
        System.out.println("Ferq: " + (a - b));
        System.out.println("Hasil: " + (a * b));

        if (b != 0) {
            System.out.println("Bolme: " + ((double) a / b));
            System.out.println("Qaliq: " + (a % b));
        } else {
            System.out.println("Sifira bolmek olmaz!");
        }

        input.close();
    }
}