public class PesawatPenumpang extends Pesawat implements MengangkutPenumpang {
    private int jumlahKursi;
    private int penumpangTerisi;

    public PesawatPenumpang(String kodePesawat, int jarakMaks, int jumlahKursi) {
        super(kodePesawat, jarakMaks);
        this.jumlahKursi = jumlahKursi;
        this.penumpangTerisi = 0;
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat Penumpang " + getKodePesawat() + " lepas landas membawa penumpang.");
    }

    @Override
    public void naikkanPenumpang(int jumlah) {
        if ((penumpangTerisi + jumlah) <= KEPASITAS_MAKS_KABIN && (penumpangTerisi + jumlah) <= jumlahKursi) {
            penumpangTerisi += jumlah;
            System.out.println(jumlah + " penumpang naik. Total penumpang: " + penumpangTerisi);
        } else {
            System.out.println("Kapasitas kabin tidak mencukupi!");
        }
    }
}