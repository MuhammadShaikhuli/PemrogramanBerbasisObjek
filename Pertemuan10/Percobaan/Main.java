public class Main {
    public static void main(String[] args) {
        // 1. Instansiasi objek Kipas
        Kipas kipas = new Kipas("Berdiri / Stand Fan", 250000.0, "Putih", "Maspion");

        // 2. Instansiasi objek TV
        TV tv = new TV("OLED 4K", 15, 7500000.0, "Hitam", "LG");
        tv.naikkanVolume(5);

        // 3. Instansiasi objek Kulkas
        Kulkas kulkas = new Kulkas(2, 3500000.0, "Silver", "Sharp");

        // 4. Instansiasi objek SmartFridge
        SmartFridge smartFridge = new SmartFridge(10, 2, 12000000.0, "Dark Steel", "Samsung");
        smartFridge.naikkanVolume(12);

        // Cetak Informasi Setiap Objek Concrete Class
        System.out.println(kipas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
    }
}
