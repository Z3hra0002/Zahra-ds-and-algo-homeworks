package evtapsiriqlari;

import java.util.Scanner;

public class sual3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Meblegi daxil et: ");
        double mebleg = input.nextDouble();

        System.out.print("Faiz derecesini daxil et: ");
        double faiz = input.nextDouble();

        double faizMeblegi = mebleg * faiz / 100;

        System.out.println("Faizin meblegi: " + faizMeblegi);

        input.close();
    }
}