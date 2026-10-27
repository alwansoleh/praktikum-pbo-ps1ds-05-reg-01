package guided3;

public interface Payable {
    double getPaymentAmount();
    
    //fitur baru
    default void printReceipt(){
        System.out.println("Struk Resmi - Total: Rp" + getPaymentAmount());
    }
    
    //Fungsi utilitas
    static void logTransaction(String message){
        System.out.println("[AUDIT LOG] " + message);
    }
}

