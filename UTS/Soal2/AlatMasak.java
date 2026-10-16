class AlatMasak {

    private String nama;
    private String materi;
    private double harga;

    public AlatMasak(String nama, String materi, double harga) {
        this.nama = nama;
        this.materi = materi;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void nyalakanKompor() {
        System.out.println("Kompor dinyalakan untuk alat masak: " + nama);
    }

    public void displayInfo() {
        System.out.println("Nama Alat: " + nama);
        System.out.println("Materi  : " + materi);
        System.out.println("Harga   : Rp " + harga);
    }
}
