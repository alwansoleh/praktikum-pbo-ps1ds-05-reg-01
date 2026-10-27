package unguided;

public class Main {
    public static void main(String[] args) {
        // 1. Uji proteksi abstraksi (tidak boleh di-instansiasi)
        // TiketBioskop tiket = new TiketBioskop("Interstellar", 40000, 2);

        // 2. Buka kasir
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat objek transaksi
        TiketReguler tiketReguler = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP tiketVIP = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack snack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // 4. Array polimorfik heterogen
        ItemTransaksi[] keranjang = {tiketReguler, tiketVIP, snack};

        // 5. Pemrosesan dinamis
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0;
        for (ItemTransaksi item : keranjang) {
            item.cetakRincianItem();
            grandTotal += item.getNominalBayar();
        }

        // 6. Tutup kasir
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}