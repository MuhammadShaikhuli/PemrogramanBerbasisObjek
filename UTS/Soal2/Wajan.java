class Wajan extends AlatMasak {
    private double diameterCm;
    private boolean antiLengket;

    public Wajan(String nama, String materi, double harga, double diameterCm, boolean antiLengket) {
        super(nama, materi, harga);
        this.diameterCm = diameterCm;
        this.antiLengket = antiLengket;
    }

    public double getDiameterCm() {
        return diameterCm;
    }

    public void setDiameterCm(double diameterCm) {
        this.diameterCm = diameterCm;
    }

    public boolean isAntiLengket() {
        return antiLengket;
    }

    public void setAntiLengket(boolean antiLengket) {
        this.antiLengket = antiLengket;
    }

    public void tumis() {
        System.out.println("Wajan sedang digunakan untuk menumis bumbu dasar");
    }

    public void tumis(String bahan) {
        System.out.println("Wajan sedang digunakan untuk menumis bahan: " + bahan);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Diameter   : " + diameterCm + " cm");
        System.out.println("Anti Lengket: " + (antiLengket ? "Ya" : "Tidak"));
    }
}