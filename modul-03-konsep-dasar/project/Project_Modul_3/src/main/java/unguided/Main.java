/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author HUAWEI
 */
import java.util.Locale;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class PengolahSuhu {

    // Class field: nilai penanda data kosong. static = milik class (dipakai bersama
    // semua object), final = nilainya tidak dapat diubah. Ditulis satu kali saja.
    private static final double NILAI_KOSONG = -1.0;

    // Penanda "tidak ditemukan" untuk hasil pencarian index
    private static final int TIDAK_DITEMUKAN = -1;
    
    // Instance field: berbeda untuk setiap object. private agar tidak bisa
    // diakses/diubah langsung dari luar class (enkapsulasi).
    private double[] suhuHarian;

    // Constructor: nama parameter sama dengan nama field, jadi pakai this.
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian; // menyimpan REFERENSI, bukan menyalin array
    }

    // Kebutuhan 3: tampilkan seluruh data, hari kosong ditandai "(kosong)"
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println(String.format(Locale.US, "Hari %d : %.1f°C", i + 1, suhuHarian[i]));
            }
        }
    }

    // Kebutuhan 4: cari index hari kosong, return TIDAK_DITEMUKAN (-1) jika tidak ada
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return TIDAK_DITEMUKAN;
    }

    // Kebutuhan 5: isi data kosong dengan rata-rata hari sebelum dan sesudahnya
    public void isiDataKosong() {
        int i = cariIndexKosong();
        if (i != TIDAK_DITEMUKAN) {
            suhuHarian[i] = (suhuHarian[i - 1] + suhuHarian[i + 1]) / 2;
        }
    }

    // Kebutuhan 6: rata-rata suhu dari data yang sudah bersih
    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }
}

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        // 1. Siapkan array
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        // 2. Buat object, tampilkan data awal, cari index kosong
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.println("Index hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());
        System.out.println();

        // 3. Isi data kosong
        pengolah.isiDataKosong();

        // 4. Tampilkan data akhir + rata-rata
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.println(String.format(Locale.US, "Rata-rata : %.2f°C", pengolah.hitungRataRata()));
        System.out.println();

        // 5. Tampilkan array suhuHarian milik main (bukan lewat object)
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < suhuHarian.length; i++) {
            sb.append(String.format(Locale.US, "%.1f", suhuHarian[i]));
            if (i < suhuHarian.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");

        
         // PENJELASAN: Array di Java bertipe reference. Variabel suhuHarian di main
         // tidak menyimpan isi array, melainkan alamat (referensi) ke array di memori.
         // Saat constructor PengolahSuhu dipanggil, yang disalin ke field
         // this.suhuHarian hanyalah alamat tersebut, bukan isi array-nya. Akibatnya,
         // variabel di main dan field di dalam object menunjuk ke SATU array yang sama
         // persis. Ketika isiDataKosong() mengubah suhuHarian[3] lewat object, array
         // yang diubah adalah array yang sama dengan milik main, sehingga perubahan
         // itu otomatis terlihat dari main walaupun main tidak mengubahnya secara
         // langsung. (Agar tidak ikut berubah, constructor harus membuat salinan,
         // misalnya this.suhuHarian = suhuHarian.clone();)
    }
}
