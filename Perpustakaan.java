import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Perpustakaan mengelola sistem peminjaman dan pencarian buku sederhana.
 * 
 * @author Aljiafrian
 * @version 1.0
 */
public class Perpustakaan {

    private List<String> daftarBuku;

    /**
     * Konstruktor default untuk inisialisasi daftar koleksi buku.
     */
    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    /**
     * Menambahkan buku baru ke dalam koleksi perpustakaan.
     * 
     * @param judulBuku Judul buku yang akan ditambahkan.
     */
    public void tambahBuku(String judulBuku) {
        daftarBuku.add(judulBuku);
        System.out.println("Buku '" + judulBuku + "' berhasil ditambahkan.");
    }

    /**
     * Menghitung denda keterlambatan pengembalian buku.
     * 
     * @param hariTerlambat Jumlah hari keterlambatan pengembalian.
     * @param dendaPerHari  Tarif denda harian dalam Rupiah.
     * @return Total nominal denda yang harus dibayar.
     */
    public double hitungDenda(int hariTerlambat, double dendaPerHari) {
        if (hariTerlambat <= 0) {
            return 0.0;
        }
        return hariTerlambat * dendaPerHari;
    }

    /**
     * Mencari buku berdasarkan kata kunci judul.
     * Fitur tambahan yang dikelola melalui Git branching.
     * 
     * @param kataKunci Kata kunci judul buku yang dicari.
     * @return Daftar judul buku yang cocok dengan pencarian.
     */
    public List<String> cariBuku(String kataKunci) {
        List<String> hasil = new ArrayList<>();
        for (String buku : daftarBuku) {
            if (buku.toLowerCase().contains(kataKunci.toLowerCase())) {
                hasil.add(buku);
            }
        }
        return hasil;
    }

    /**
     * Method utama untuk menjalankan program perpustakaan.
     * 
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan();
        
        p.tambahBuku("Pemrograman Java Lanjut");
        p.tambahBuku("Struktur Data dan Algoritma");
        p.tambahBuku("Panduan Git & GitHub");

        System.out.println("\n--- Perhitungan Denda ---");
        int keterlambatan = 3;
        double dendaHarian = 2000.0;
        double totalDenda = p.hitungDenda(keterlambatan, dendaHarian);
        System.out.println("Keterlambatan: " + keterlambatan + " hari");
        System.out.println("Total Denda  : Rp " + totalDenda);

        System.out.println("\n--- Hasil Pencarian Buku 'Java' ---");
        List<String> hasilCari = p.cariBuku("Java");
        for (String buku : hasilCari) {
            System.out.println("- " + buku);
        }
    }
}
