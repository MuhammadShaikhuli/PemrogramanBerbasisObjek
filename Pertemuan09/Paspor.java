import java.time.LocalDate;

public class Paspor extends DokumenIdentitas {
    private LocalDate tanggalTerbit;

    public Paspor(String noIdentitas, String namaPemilik, LocalDate tanggalTerbit) {
        super(noIdentitas, namaPemilik);
        this.tanggalTerbit = tanggalTerbit;
    }

    @Override
    public void caraMembuat() {
        System.out.println("Cara Membuat Paspor: Daftar online lewat M-Paspor, wawancara di Imigrasi, dan bayar biaya PNBP.");
    }

    @Override
    public void cekMasaBerlaku() {
        System.out.println("Masa Berlaku Paspor: 10 tahun sejak " + tanggalTerbit );
    } 
}

