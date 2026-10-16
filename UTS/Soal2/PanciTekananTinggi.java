class PanciTekananTinggi extends Panci {
    private double batasTekananBar;

    public PanciTekananTinggi(String nama, String materi, double harga, double kapasitasLiter, double batasTekananBar) {
        super(nama, materi, harga, kapasitasLiter);
        this.batasTekananBar = batasTekananBar;
    }

    public void kunciTutupPanci() {
        System.out.println("Tutup panci dikunci rapat. Siap beroperasi hingga tekanan " + batasTekananBar + " Bar");
    }

    public void masakCepat() {
        kunciTutupPanci();
        System.out.println("Proses memasak bertekanan tinggi sedang berjalan (lebih cepat empuk).");
    }
}