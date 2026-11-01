public class PesawatAmfibi extends Pesawat implements MengangkutPenumpang, MengangkutKargo, BisaMendaratDiAir {
    private int jumlahKursi;
    private int penumpangTerisi;
    private double kapasitasKargoKg;
    private double muatanKg;
    private int jumlahPelampung;
    private boolean sedangDiAir;

    public PesawatAmfibi(String kodePesawat, int jarakMaks, int jumlahKursi, double kapasitasKargoKg, int jumlahPelampung) {
        super(kodePesawat, jarakMaks);
        this.jumlahKursi = jumlahKursi;
        this.kapasitasKargoKg = kapasitasKargoKg;
        this.jumlahPelampung = jumlahPelampung;
        this.penumpangTerisi = 0;
        this.muatanKg = 0.0;
        this.sedangDiAir = false;
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat Amfibi " + getKodePesawat() + " mengudara dari permukaan air/darat.");
    }

    @Override
    public void naikkanPenumpang(int jumlah) {
        if ((penumpangTerisi + jumlah) <= jumlahKursi) {
            penumpangTerisi += jumlah;
            System.out.println("[Amfibi] " + jumlah + " penumpang naik. Total: " + penumpangTerisi);
        } else {
            System.out.println("[Amfibi] Kursi penuh!");
        }
    }

    @Override
    public void muatKargo(double beratKg) {
        if ((muatanKg + beratKg) <= kapasitasKargoKg) {
            muatanKg += beratKg;
            System.out.println("[Amfibi] Kargo " + beratKg + " kg ditambahkan. Total muatan: " + muatanKg + " kg");
        } else {
            System.out.println("[Amfibi] Kargo melebihi kapasitas!");
        }
    }

    @Override
    public void mendaratDiAir() {
        sedangDiAir = true;
        System.out.println("Pesawat Amfibi " + getKodePesawat() + " berhasil mendarat di atas permukaan air dengan aman.");
    }
}