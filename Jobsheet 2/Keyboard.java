// Class blueprint untuk Keyboard
public class Keyboard {
    // 1. Deklarasi Atribut
    String merk;
    int panjangKeyboard;
    int lebarKeyboard;
    int tinggiKeyboard;
    String warnaKeyboard;
    int jumlahTombol;
    String modelKeyboard;
    boolean statusKoneksi;
    boolean statusLampu;
    double hargaKeyboard;

    // Constructor untuk inisialisasi data awal
    public Keyboard(String merk, int panjang, int lebar, int tinggi, String warna, int jumlahTombol, String model, double harga) {
        this.merk = merk;
        this.panjangKeyboard = panjang;
        this.lebarKeyboard = lebar;
        this.tinggiKeyboard = tinggi;
        this.warnaKeyboard = warna;
        this.jumlahTombol = jumlahTombol;
        this.modelKeyboard = model;
        this.statusKoneksi = false;
        this.statusLampu = false;
        this.hargaKeyboard = harga;
    }

    // Method
    public boolean hubungkanKeyboard() {
        this.statusKoneksi = true;
        System.out.println("> ["+ merk +"]: Membuka koneksi...");
        return this.statusKoneksi;
    }

    public boolean putuskanKeyboard() {
        this.statusKoneksi = false;
        System.out.println("> ["+ merk +"]: Memutuskan koneksi...");
        return this.statusKoneksi;
    }

    public boolean hidupkanLampu() {
        this.statusLampu = true;
        System.out.println("> ["+ merk +"]: Menyalakan lampu RGB...");
        return this.statusLampu;
    }

    public boolean matikanLampu() {
        this.statusLampu = false;
        System.out.println("> ["+ merk +"]: Mematikan lampu RGB...");
        return this.statusLampu;
    }

    public void tampilkanInfo() {
        System.out.println("Merk           : " + merk);
        System.out.println("Dimensi        : " + panjangKeyboard + " x " + lebarKeyboard + " x " + tinggiKeyboard + " cm");
        System.out.println("Warna          : " + warnaKeyboard);
        System.out.println("Jumlah Tombol  : " + jumlahTombol);
        System.out.println("Model          : " + modelKeyboard);
        System.out.println("Status Koneksi : " + (statusKoneksi ? "Terhubung" : "Terputus"));
        System.out.println("Status Lampu   : " + (statusLampu ? "Menyala" : "Mati"));
        System.out.println("Harga          : Rp" + String.format("%.0f", hargaKeyboard));
    }
}