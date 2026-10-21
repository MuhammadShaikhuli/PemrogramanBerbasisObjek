import java.time.LocalDate;

public class DemoMain {
    public static void main(String[] args) {
        DokumenIdentitas pasporBudi = new Paspor("X123456", "Budi Santoso", LocalDate.of(2020, 5, 20));
        
        DokumenIdentitas ktpBudi = new Ktp("31710123456789", "Budi Santoso", LocalDate.of(1995, 8, 17));

        System.out.println("=== DOKUMEN 1: PASPOR ===");
        pasporBudi.tampilkanProfil();
        pasporBudi.caraMembuat();
        pasporBudi.cekMasaBerlaku();
        
        System.out.println("\n=== DOKUMEN 2: KTP ===");
        
        ktpBudi.tampilkanProfil();
        ktpBudi.caraMembuat();
        ktpBudi.cekMasaBerlaku();
    }
}
