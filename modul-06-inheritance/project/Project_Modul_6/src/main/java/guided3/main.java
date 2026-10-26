package guided3;

public class main {
     public static void main(String[] args) {
        lagu d, e;
        d = new lagu();
        e = new lagu();
        
        d.IsiParam("Lagu 1");
        e.IsiParam("kepastian yang kutunggu", "GiGi");
        
        d.tampilkan();
        e.tampilkan();
    }
}