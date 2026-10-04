class MobilListrik extends Mobil {
    private int kapasitasBaterai; // dalam kWh

    public MobilListrik(String merk, String model, int tahunKeluaran, int kapasitasBaterai) {
        super(merk, model, tahunKeluaran); // Memanggil constructor parent
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Mobil Listrik ===");
        super.tampilkanInfo();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " kWh");
        System.out.println();
    }
}
