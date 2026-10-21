import java.time.LocalDate;

public class Ktp extends DokumenIdentitas {
    private LocalDate tanggalLahirPemilik;

    public Ktp(String noIdentitas, String namaPemilik, LocalDate tanggalLahir) {
        super(noIdentitas, namaPemilik);
        this.tanggalLahirPemilik = tanggalLahir;
    }

    @Override
    public void caraMembuat() {
        System.out.println("Cara Membuat KTP: Datang ke kantor Dukcapil, perekaman retina/sidik jari, dan cetak fisik.");
    }

    @Override
    public void cekMasaBerlaku() {
        System.out.println("Tanggal Lahir Pemilik KTP: " + tanggalLahirPemilik);
        System.out.println("Masa Berlaku KTP: Seumur Hidup.");
    }
}
