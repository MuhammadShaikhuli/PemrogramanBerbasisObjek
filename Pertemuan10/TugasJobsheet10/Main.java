public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM PENERBANGAN ===");

        // Instansiasi Pesawat Penumpang
        PesawatPenumpang p1 = new PesawatPenumpang("GA-101", 3000, 100);
        p1.terbang();
        p1.naikkanPenumpang(45);

        System.out.println("-----------------------------------");

        // Instansiasi Pesawat Kargo
        PesawatKargo p2 = new PesawatKargo("KG-505", 4500, 4000.0);
        p2.terbang();
        p2.muatKargo(1500.0);

        System.out.println("-----------------------------------");

        // Instansiasi Pesawat Amfibi (Multiple Interface)
        PesawatAmfibi p3 = new PesawatAmfibi("AM-999", 1200, 20, 800.0, 4);
        p3.terbang();
        p3.naikkanPenumpang(10);
        p3.muatKargo(250.0);
        p3.mendaratDiAir();
    }
}