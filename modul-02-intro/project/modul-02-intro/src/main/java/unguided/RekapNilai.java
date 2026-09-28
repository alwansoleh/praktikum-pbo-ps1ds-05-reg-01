/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author HUAWEI
 */
public class RekapNilai {
     public static void main(String[] args) {
        // Konstanta KKM
        final double KKM = 75.0;

        // Array 1 dimensi: nama mahasiswa
        String[] nama = {"Andi", "Budi", "Citra"};

        // Array 2 dimensi rectangular (3 baris x 2 kolom): nilai modul
        double[][] nilai = {
            {80.0, 85.0},
            {70.0, 65.0},
            {90.0, 90.0}
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);

        // Perulangan untuk mengakses setiap mahasiswa
        for (int i = 0; i < nama.length; i++) {
            double total = 0;

            // Perulangan untuk menjumlahkan nilai tiap modul
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }

            double rata = total / nilai[i].length;

            // Percabangan untuk menentukan status
            String status;
            if (rata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println();
            System.out.println("Mahasiswa " + (i + 1) + ": " + nama[i]);
            System.out.println("Nilai Modul 1 : " + nilai[i][0]);
            System.out.println("Nilai Modul 2 : " + nilai[i][1]);
            System.out.println("Rata-rata     : " + rata);
            System.out.println("Status        : " + status);
        }
    }
}
