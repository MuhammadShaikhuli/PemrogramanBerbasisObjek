public class MainAlatMasak {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN KELAS WAJAN ===");
        Wajan wajanku = new Wajan("Wajan Teflon", "Aluminium", 150000.0, 28.0, true);
        wajanku.displayInfo();
        wajanku.nyalakanKompor();
        wajanku.tumis();
        wajanku.tumis("Daging Sapi & Cabai");
        
        System.out.println("\n=== PENGUJIAN KELAS PANCI TEKANAN TINGGI ===");
        PanciTekananTinggi presto = new PanciTekananTinggi("Presto Maxim", "Stainless Steel", 450000.0, 8.0, 1.8);
        presto.displayInfo();
        presto.rebusAir();
        presto.masakCepat();
    }
}