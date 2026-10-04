public class Main {
    public static void main(String[] args) {
        MobilListrik tesla = new MobilListrik("Tesla", "Model Y", 2023, 75);
        
        MobilBensin toyota = new MobilBensin("Toyota", "Avanza", 2022, 45);

        tesla.tampilkanInfo();
        toyota.tampilkanInfo();

        // enkapsulasi (setter)
        System.out.println("--- Setelah Update Data ---");
        tesla.setKapasitasBaterai(82);
        toyota.setModel("Innova Zenix");

        // Menampilkan data terbaru
        System.out.println("Merk Mobil: " + tesla.getMerk());
        System.out.println("Kapasitas Baterai Baru: " + tesla.getKapasitasBaterai() + " kWh");
        System.out.println("Model Toyota (Baru): " + toyota.getModel());
    }
}