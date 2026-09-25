public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan;

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getPlatNomor() { return platNomor; }
    public String getMerek() { return merek; }
    public String getModel() { return model; }
    public String getTipeKendaraan() { return tipeKendaraan; }

    // Metode untuk menghitung total biaya berdasarkan jenis kendaraan
    public double hitungTotalBiaya(Layanan layanan) {
        double biayaTambahan = 0;
        if (tipeKendaraan.equalsIgnoreCase("Mobil")) {
            biayaTambahan = 50000.0;
        } else if (tipeKendaraan.equalsIgnoreCase("Sepeda Motor")) {
            biayaTambahan = 20000.0;
        }
        return layanan.getServicePrice() + biayaTambahan;
    }
}