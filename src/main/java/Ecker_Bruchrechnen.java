import java.util.Scanner;

public class Ecker_Bruchrechnen {

    private static int ggt(int zaehler, int nenner) {
        while (nenner != 0) {
            if (zaehler > nenner) {
                zaehler = zaehler - nenner;
            } else {
                nenner = nenner - zaehler;
            }
        }
        return zaehler;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int zaehler;
        int nenner;
        int ggt;

        System.out.print("Zähler: ");
        zaehler = scanner.nextInt();

        System.out.print("Nenner: ");
        nenner = scanner.nextInt();

        ggt = ggt(zaehler , nenner);

        zaehler /= ggt;
        nenner /= ggt;

        System.out.printf("%d / %d", zaehler , nenner);
    }
}
