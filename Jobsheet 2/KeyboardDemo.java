public class KeyboardDemo {
    public static void main(String[] args) {
        // Instansiasi 2 Objek
        Keyboard kb1 = new Keyboard("Logitech", 45, 15, 3, "Hitam", 104, "Full-Size", 1500000);
        Keyboard kb2 = new Keyboard("Razer", 35, 13, 4, "Hitam", 87, "TKL", 2200000);

        System.out.println("=== DATA AWAL KEYBOARD ===");
        kb1.tampilkanInfo();
        System.out.println("-----------------------------------\n");
        kb2.tampilkanInfo();

        System.out.println("\n=== UPDATE ATRIBUT ===");

        // Keyboard 1
        System.out.println("\n--- Memproses Keyboard 1 (" + kb1.merk + ") ---");
        kb1.hubungkanKeyboard();
        kb1.hidupkanLampu();
        kb1.warnaKeyboard = "Putih Custom"; // Update warna
        kb1.hargaKeyboard = 1650000;      // Update harga

        // Keyboard 2
        System.out.println("\n--- Memproses Keyboard 2 (" + kb2.merk + ") ---");
        kb2.hubungkanKeyboard();
        kb2.matikanLampu();
        kb2.hargaKeyboard = 2000000;      // Update harga

        System.out.println("\n=== DATA SETELAH DI-UPDATE ===");
        kb1.tampilkanInfo();
        System.out.println("-----------------------------------");
        kb2.tampilkanInfo();
    }
}