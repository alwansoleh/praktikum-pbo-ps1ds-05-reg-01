package unguided1;

public class HasilEksperimen implements Comparable<HasilEksperimen> {

    // static variable untuk menghitung jumlah eksperimen yang dibuat
    private static int jumlahEksperimen = 0;

    private String namaModel;
    private double akurasi;      // nilai 0 - 1
    private int waktuTraining;   // dalam detik

    public HasilEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++; // bertambah setiap objek baru dibuat
    }

    // static method untuk mengambil jumlah eksperimen
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Urutan default: akurasi tertinggi ke terendah
    @Override
    public int compareTo(HasilEksperimen other) {
        return Double.compare(other.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }
}
