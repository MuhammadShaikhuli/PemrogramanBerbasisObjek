public class Anggota {
    private String nomorKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Constructor
    public Anggota(String nomorKtp, String nama, int limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Getter nomorKtp
    public String getNomorKtp() {
        return nomorKtp;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter limitPinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    // Getter jumlahPinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method meminjam uang dengan validasi limit
    public void pinjam(int nominal) {
        if ((this.jumlahPinjaman + nominal) > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    // Method mengangsur pinjaman
    public void angsur(int nominal) {
        this.jumlahPinjaman -= nominal;
    }
}