public class Main {
    public static void main(String[] args) {
        ModelRegresi regresi = new ModelRegresi("Regresi Linier", 500, 4);
        ModelKlasifikasi tree = new ModelKlasifikasi("Decision Tree", 800, 3);
        ModelDeepLearning nn = new ModelDeepLearning("Neural Network", 1000, 5, 3);

        ModelML[] daftarModel = {regresi, tree, nn};

        int totalBiaya = 0;
        for (ModelML m : daftarModel) {
            m.tampilkanInfo();
            int biaya = m.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }
        System.out.println("Total biaya: " + totalBiaya);

        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + daftarModel[0].hitungBiaya(10));

        // Method 2 parameter hanya ada di ModelRegresi, jadi perlu casting
        ModelRegresi r = (ModelRegresi) daftarModel[0];
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + r.hitungBiaya(10, 50));
    }
}