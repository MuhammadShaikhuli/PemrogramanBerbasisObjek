class MobilBensin extends Mobil {

    private double kapasitasTangki; // dalam Liter

    public MobilBensin(String merk, String model, int tahunKeluaran, double kapasitasTangki) {
        super(merk, model, tahunKeluaran); // Memanggil constructor parent
        this.kapasitasTangki = kapasitasTangki;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin bensin dihidupkan dengan menekan tombol 'Start Engine' dan injak kopling.");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Mobil Bensin ===");
        super.tampilkanInfo();
        System.out.println("Kapasitas Tangki : " + kapasitasTangki + " Liter");
        System.out.println();
    }
}
