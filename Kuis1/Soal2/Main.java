import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM BENGKEL MAJU ===");

        // Data Karyawan & Daftar Layanan
        Karyawan mekanik = new Karyawan("K001", "Budi Santoso", "Mekanik Senior");
        
        List<Layanan> daftarLayanan = new ArrayList<>();
        Layanan serviceRutin = new Layanan("Service Rutin Berkala", 100000.0);
        Layanan gantiOli = new Layanan("Ganti Oli Mesin", 75000.0);
        daftarLayanan.add(serviceRutin);
        daftarLayanan.add(gantiOli);

        // Informasi Layanan
        System.out.println("DAFTAR LAYANAN TERSEDIA:");
        for (Layanan l : daftarLayanan) {
            System.out.println("- " + l.getServiceName() + ": Rp" + l.getServicePrice());
        }
        System.out.println("Petugas: " + mekanik.getNamaKaryawan() + " (" + mekanik.getPosisi() + ")\n");

        // Data Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Rizky Pratama", "081298765432");

        // Sampel Kendaraan (2 Mobil & 2 Sepeda Motor)
        Kendaraan mobil1 = new Kendaraan("N 1234 AB", "Toyota", "Avanza", "Mobil");
        Kendaraan mobil2 = new Kendaraan("N 5678 CD", "Honda", "Civic", "Mobil");
        Kendaraan motor1 = new Kendaraan("N 9101 EF", "Honda", "Vario 160", "Sepeda Motor");
        Kendaraan motor2 = new Kendaraan("N 1122 GH", "Yamaha", "NMAX", "Sepeda Motor");

        pelanggan1.tambahKendaraan(mobil1);
        pelanggan1.tambahKendaraan(mobil2);
        pelanggan1.tambahKendaraan(motor1);
        pelanggan1.tambahKendaraan(motor2);

        // Detail Transaksi dan Estimasi Biaya
        System.out.println("=== INFORMASI PELANGGAN & PERHITUNGAN BIAYA SERVICE ===");
        System.out.println("Nama Pelanggan  : " + pelanggan1.getNama());
        System.out.println("Nomor Telepon   : " + pelanggan1.getNomorTelepon());

        // Service Rutin sebagai sampel
        Layanan layananDipilih = serviceRutin; 
        System.out.println("\nLayanan Terpilih: " + layananDipilih.getServiceName() + " (Harga Dasar: Rp" + layananDipilih.getServicePrice() + ")\n");

        System.out.println("Daftar Kendaraan & Total Estimasi Biaya:");
        int no = 1;
        for (Kendaraan k : pelanggan1.getDaftarKendaraan()) {
            double totalBiaya = k.hitungTotalBiaya(layananDipilih);
            System.out.println(no++ + ". " + k.getPlatNomor() + " " + k.getMerek() + " " + k.getModel() 
                               + " (" + k.getTipeKendaraan() + ")");
            System.out.println("   Total Biaya Service: Rp" + totalBiaya);
        }
    }
}