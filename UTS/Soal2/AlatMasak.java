class AlatMasak {
    private String nama;
    private String materi;
    private double harga;

    public AlatMasak(String nama, String materi, double harga) {
        this.nama = nama;
        this.materi = materi;
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