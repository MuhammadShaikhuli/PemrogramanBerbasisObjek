public class Sertifikat {
    private String nomorSertifikat;
    private String tanggalTerbit;
    private int idPeserta;
    private int idEvent;

    // Konstruktor
    public Sertifikat(String nomorSertifikat, String tanggalTerbit, int idPeserta, int idEvent) {
        this.nomorSertifikat = nomorSertifikat;
        this.tanggalTerbit = tanggalTerbit;
        this.idPeserta = idPeserta;
        this.idEvent = idEvent;
    }

    // Getter
    public String getNomorSertifikat() {
        return nomorSertifikat;
    }

    // Method untuk menampilkan sertifikat
    public void tampilkanSertifikat() {
        System.out.println("----------------------------------------");
        System.out.println("SERTIFIKAT KELULUSAN / KEIKUTSERTAAN");
        System.out.println("No. Sertifikat : " + nomorSertifikat);
        System.out.println("Tanggal Terbit : " + tanggalTerbit);
        System.out.println("ID Peserta     : " + idPeserta);
        System.out.println("ID Event       : " + idEvent);
        System.out.println("----------------------------------------");
    }
}
