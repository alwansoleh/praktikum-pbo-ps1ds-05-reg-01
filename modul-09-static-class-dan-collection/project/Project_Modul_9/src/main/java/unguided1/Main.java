package unguided1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // List dengan generics
        List<HasilEksperimen> daftar = new ArrayList<>();
        daftar.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        daftar.add(new HasilEksperimen("Random Forest", 0.91, 45));
        daftar.add(new HasilEksperimen("SVM", 0.87, 60));
        daftar.add(new HasilEksperimen("KNN", 0.79, 5));
        daftar.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen (static method)
        System.out.println("Jumlah eksperimen: " + HasilEksperimen.getJumlahEksperimen());

        // 2. Sorted by akurasi (Comparable)
        System.out.println("\nSorted by akurasi");
        Collections.sort(daftar);
        for (HasilEksperimen h : daftar) {
            System.out.println(h);
        }

        // 3. Sorted by waktu training (Comparator)
        System.out.println("\nSorted by waktu training");
        Collections.sort(daftar, new WaktuTrainingComparator());
        for (HasilEksperimen h : daftar) {
            System.out.println(h);
        }

        // 4. Filtering akurasi minimal 0.85 (lambda)
        // Diurutkan dulu berdasarkan akurasi agar sesuai contoh output
        System.out.println("\nModel dengan akurasi minimal 0.85");
        Collections.sort(daftar);
        daftar.stream()
              .filter(h -> h.getAkurasi() >= 0.85)
              .forEach(System.out::println);

        // 5. Pencarian model "KNN" (lambda), null jika tidak ditemukan
        System.out.println("\nPencarian model KNN");
        HasilEksperimen hasil = daftar.stream()
                .filter(h -> h.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(hasil);
    }
}
