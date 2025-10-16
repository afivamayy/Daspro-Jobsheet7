import java.util.Scanner;
public class TiketBioskop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        double total = 0;
        final int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0)
                break;
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!\n");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10)
                diskon = 0.15;
            else if (jumlahTiket > 4)
                diskon = 0.10;

            double hargaTotal = jumlahTiket * hargaTiket * (1 - diskon);
            total += hargaTotal;
            System.out.println("Total bayar pelanggan: Rp " + hargaTotal + "\n");
        }

        System.out.println("Total penjualan tiket hari ini: Rp " + total);
        sc.close();
    }
}
