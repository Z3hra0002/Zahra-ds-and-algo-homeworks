package evtapsiriqlari;

public class sual8 {
    public static void main(String[] args) {
        int yas = 15;

        if (yas >= 0 && yas <= 12) {
            System.out.println("uşaq");
        } else if (yas >= 13 && yas <= 17) {
            System.out.println("yeniyetmə");
        } else if (yas >= 18) {
            System.out.println("yetkin");
        } else {
            System.out.println("Yanlış yaş");
        }
    }
}
