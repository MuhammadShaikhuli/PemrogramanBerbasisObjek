public class PesawatKargo extends Pesawat implements MengangkutKargo {
    private double kapasitasKargoKg;
    private double muatanKg;

    public PesawatKargo(String kodePesawat, int jarakMaks, double kapasitasKargoKg) {
        super(kodePesawat, jarakMaks);
        this.kapasitasKargoKg = kapasitasKargoKg;
        this.muatanKg = 0.0;
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat Kargo " + getKodePesawat() + " lepas landas membawa barang logistik.");
    }

    @Override
    public void muatKargo(double beratKg) {
        if ((muatanKg + beratKg) <= BERAT_KARGO_MAKS_KG && (muatanKg + beratKg) <= kapasitasKargoKg) {
            muatanKg += beratKg;
            System.out.println("Kargo seberat " + beratKg + " kg dimuat. Total muatan: " + muatanKg + " kg");
        } else {
            System.out.println("Mebihi batas kapasitas kargo maksimum!");
        }
    }
}