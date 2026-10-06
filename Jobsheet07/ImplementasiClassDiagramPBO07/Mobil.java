class Mobil {
    // FINAL ATTRIBUTE
    public static final int JUMLAH_RODA = 4;

    private String merk;
    private String model;
    private int tahunKeluaran;

    public Mobil(String merk, String model, int tahunKeluaran) {
        this.merk = merk;
        this.model = model;
        this.tahunKeluaran = tahunKeluaran;
    }

    // FINAL METHOD
    public final void infoPabrik() {
        System.out.println("Mobil ini memiliki standar " + JUMLAH_RODA + " roda dan diproduksi secara massal.");
    }

    // METHOD OVERLOADING (Versi 1)
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dihidupkan dengan kunci kontak standar.");
    }

    // METHOD OVERLOADING (Versi 2)
    public void nyalakanMesin(String mode) {
        System.out.println("Mesin mobil dihidupkan menggunakan mode: " + mode);
    }

    public void tampilkanInfo() {
        System.out.println("Merk           : " + merk);
        System.out.println("Model          : " + model);
        System.out.println("Tahun Keluaran : " + tahunKeluaran);
    }

    // Getter & Setter
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getTahunKeluaran() { return tahunKeluaran; }
    public void setTahunKeluaran(int tahunKeluaran) { this.tahunKeluaran = tahunKeluaran; }
}