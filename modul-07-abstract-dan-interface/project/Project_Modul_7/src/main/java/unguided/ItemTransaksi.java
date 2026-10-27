package unguided;

public interface ItemTransaksi {
    double getNominalBayar();
    String getNamaTransaksi();

    // Default method: format baris struk
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static method: utilitas log kasir
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}