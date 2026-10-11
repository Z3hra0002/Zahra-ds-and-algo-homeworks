package evtapsiriqlari;

import java.util.Scanner;

public class sual9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bali daxil et (0-100): ");
        int bal = input.nextInt();

        if (bal < 0 || bal > 100) {
            System.out.println("Yanlis bal!");
        } else {
            int onluq = bal / 10;

            switch (onluq) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
            }
        }

        input.close();
    }
}