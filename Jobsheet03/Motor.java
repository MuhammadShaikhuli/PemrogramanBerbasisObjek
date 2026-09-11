public class Motor {
    // Mengubah modifier atribut menjadi private
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    // Getter dan Setter platNomor
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    // Getter dan Setter isMesinOn
    public boolean isIsMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    // Getter dan Setter kecepatan
    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif!");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh melebihi 100!");
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("--------------------");
    }
}