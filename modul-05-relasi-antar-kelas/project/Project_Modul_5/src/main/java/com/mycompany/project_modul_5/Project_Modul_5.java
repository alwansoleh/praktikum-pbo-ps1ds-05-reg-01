package com.mycompany.project_modul_5;

import guided.Dosen;
import guided.agregasi.Jurusan;
import guided.agregasi.Mahasiswa;
import guided.komposisi.Main;

public class Project_Modul_5 {

    public static void main(String[] args) {
        System.out.println("=== GUIDED AGREGASI ===");
        runGuidedAgregasi();

        System.out.println();
        System.out.println("=== GUIDED KOMPOSISI ===");
        runGuidedKomposisi();

        System.out.println();
        System.out.println("=== GUIDED ASOSIASI ===");
        runGuidedAsosiasi();
    }

    public static void runGuidedAgregasi() {
        Mahasiswa m1 = new Mahasiswa("103112400148", "Messi");
        Mahasiswa m2 = new Mahasiswa("103112400149", "Yamal");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();
    }

    public static void runGuidedKomposisi() {
        Main.main(new String[0]);
    }

    public static void runGuidedAsosiasi() {
        Dosen.main(new String[0]);
    }
}