import java.util.Scanner;

/**
 * Program Java sederhana untuk menghitung pangkat dari sebuah bilangan.
 */
public class PangkatCalulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        double bilangan = input.nextDouble();

        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();

        double hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(bilangan + " pangkat " + pangkat + " = " + hasil);
    }

    /**
     * Menghitung pangkat dari sebuah bilangan.
     *
     * @param bilangan Bilangan yang akan dipangkatkan.
     * @param pangkat  Pangkat yang akan diterapkan pada bilangan.
     * @return Hasil pangkat dari bilangan.
     */
    public static double hitungPangkat(double bilangan, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else {
            double hasil = 1;
            for (int i = 0; i < Math.abs(pangkat); i++) {
                hasil *= bilangan;
            }

            if (pangkat < 0) {
                hasil = 1 / hasil;
            }

            return hasil;
        }
    }
}
