public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String posisi;

    public Karyawan(String idKaryawan, String namaKaryawan, String posisi) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.posisi = posisi;
    }

    public String getIdKaryawan() { return idKaryawan; }
    public void setIdKaryawan(String idKaryawan) { this.idKaryawan = idKaryawan; }

    public String getNamaKaryawan() { return namaKaryawan; }
    public void setNamaKaryawan(String namaKaryawan) { this.namaKaryawan = namaKaryawan; }

    public String getPosisi() { return posisi; }
    public void setPosisi(String posisi) { this.posisi = posisi; }
}