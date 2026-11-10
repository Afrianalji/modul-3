import java.util.Scanner;

public class NotaRestoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("          RESTORAN SUKAMAJU          ");
        System.out.println("=====================================");
        System.out.print("Masukkan Nama Pelanggan : ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan Total Makanan (Rp): ");
        double totalMakanan = scanner.nextDouble();

        System.out.print("Masukkan Total Minuman (Rp): ");
        double totalMinuman = scanner.nextDouble();

        // --- Rumus Perhitungan (Live Template: hitungnota) ---
        double subtotal = totalMakanan + totalMinuman;
        double pajak = subtotal * 0.10;
        double totalBayar = subtotal + pajak;
        // --------------------------------------------------

        System.out.println("\n=====================================");
        System.out.println("           NOTA PEMBAYARAN           ");
        System.out.println("=====================================");
        System.out.println("Pelanggan   : " + namaPelanggan);
        System.out.println("Subtotal    : Rp " + String.format("%,.2f", subtotal));
        System.out.println("Pajak (10%) : Rp " + String.format("%,.2f", pajak));
        System.out.println("-------------------------------------");
        System.out.println("Total Bayar : Rp " + String.format("%,.2f", totalBayar));
        System.out.println("=====================================");

        scanner.close();
    }
}
