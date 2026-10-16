class PanciTekananTinggi extends Panci {
    private double batasTekananBar;

    public PanciTekananTinggi(String nama, String materi, double harga, double kapasitasLiter, double batasTekananBar) {
        super(nama, materi, harga, kapasitasLiter);
        this.batasTekananBar = batasTekananBar;
    }

    public double getBatasTekananBar() {
        return batasTekananBar;
    }

    public void setBatasTekananBar(double batasTekananBar) {
        this.batasTekananBar = batasTekananBar;
    }

    public void kunciTutupPanci() {
        System.out.println("Tutup panci dikunci rapat. Siap beroperasi hingga tekanan " + batasTekananBar + " Bar");
    }

    public void masakCepat() {
        kunciTutupPanci();
        System.out.println("Proses memasak bertekanan tinggi sedang berjalan (lebih cepat empuk).");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Batas Tekanan: " + batasTekananBar + " bar");
    }
}