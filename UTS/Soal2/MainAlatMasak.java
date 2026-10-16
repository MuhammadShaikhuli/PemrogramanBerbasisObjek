public class MainAlatMasak {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN WAJAN & SETTER/GETTER ===");
        Wajan wajanku = new Wajan("Wajan Teflon", "Aluminium", 150000.0, 28.0, true);
        wajanku.displayInfo();
        wajanku.nyalakanKompor();
        wajanku.tumis();
        wajanku.tumis("Daging Sapi & Cabai");

        wajanku.setHarga(175000.0);
        wajanku.setAntiLengket(false);

        System.out.println("Harga Terbaru     : Rp " + wajanku.getHarga());
        System.out.println("Status Anti lengket baru: " + (wajanku.isAntiLengket() ? "Ya" : "Tidak"));

        System.out.println("\n=== PENGUJIAN PANCI TEKANAN TINGGI & GETTER/SETTER ===");
        PanciTekananTinggi presto = new PanciTekananTinggi("Presto Maxim", "Stainless Steel", 450000.0, 8.0, 1.8);
        presto.displayInfo();
        presto.rebusAir();
        presto.masakCepat();
        
        presto.setBatasTekananBar(2.0);
        System.out.println("Batas Tekanan Baru: " + presto.getBatasTekananBar() + " Bar");
    }
}