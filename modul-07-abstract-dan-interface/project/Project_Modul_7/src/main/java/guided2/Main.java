package guided2;

public class Main {
    public static void main(String[] args) {
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Monitor LED", 2, 15000);
        items[1] = new SalariedEmployee("Budi", 50000);

        for (Payable item : items) {
            System.out.println("Jumlah yang perlu dibayar: Rp" + item.getPaymentAmount());
        }
    }
}