package evtapsiriglari;
import java.util.Scanner;
public class sual7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eded daxil et: ");
        int eded = input.nextInt();

        if (eded > 0) {
            System.out.println("Musbet ededdir");
        } else if (eded < 0) {
            System.out.println("Menfi ededdir");
        } else {
            System.out.println("Sifirdir");
        }

        input.close();
    }
}