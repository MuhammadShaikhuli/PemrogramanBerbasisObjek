class Panci extends AlatMasak {
    private double kapasitasLiter;

    public Panci(String nama, String materi, double harga, double kapasitasLiter) {
        super(nama, materi, harga);
        this.kapasitasLiter = kapasitasLiter;
    }

    public double getKapasitasLiter() {
        return kapasitasLiter;
    }

    public void setKapasitasLiter(double kapasitasLiter) {
        this.kapasitasLiter = kapasitasLiter;
    }

    public void rebusAir() {
        System.out.println("Panci sedang merebus air dengan kapasitas " + kapasitasLiter + " Liter");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas: " + kapasitasLiter + " Liter");
    }
}