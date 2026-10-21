public abstract class DokumenIdentitas {
    private String noIdentitas;
    private String namaPemilik;

    public DokumenIdentitas(String noIdentitas, String namaPemilik) {
        this.noIdentitas = noIdentitas;
        this.namaPemilik = namaPemilik;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void tampilkanProfil() {
        System.out.println("No. Identitas: " + this.noIdentitas);
        System.out.println("Nama Pemilik : " + this.namaPemilik);
    }

    public abstract void caraMembuat();
    public abstract void cekMasaBerlaku();
}
