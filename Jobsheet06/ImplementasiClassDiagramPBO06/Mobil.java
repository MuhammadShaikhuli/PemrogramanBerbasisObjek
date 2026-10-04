class Mobil {
    private String merk;
    private String model;
    private int tahunKeluaran;

    public Mobil(String merk, String model, int tahunKeluaran) {
        this.merk = merk;
        this.model = model;
        this.tahunKeluaran = tahunKeluaran;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahunKeluaran() {
        return tahunKeluaran;
    }

    public void setTahunKeluaran(int tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public void tampilkanInfo() {
        System.out.println("Merk           : " + merk);
        System.out.println("Model          : " + model);
        System.out.println("Tahun Keluaran : " + tahunKeluaran);
    }
}