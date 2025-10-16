import java.util.Scanner;
public class Parkir03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("\nMasukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Selesai): ");
            jenis = sc.nextInt();
            if (jenis == 0)
                break;
            System.out.print("Masukkan durasi parkir: ");
            durasi = sc.nextInt();

            int biaya;
            if (durasi > 5)
                biaya = 12500;
            else if (jenis == 1)
                biaya = 3000 * durasi;
            else
                biaya = 2000 * durasi;
            total += biaya;
            System.out.println("Biaya parkir kendaraan ini: Rp " + biaya);
        } while (true);
        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + total);
        sc.close();
    }
}
