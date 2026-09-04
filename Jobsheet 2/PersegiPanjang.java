public class PersegiPanjang {
    int panjang;
    int lebar;

    // Constructor
    public PersegiPanjang(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    // Menampilkan Info
    public void displayInfo() {
        System.out.println("Data Persegi Panjang:");
        System.out.println("- Panjang : " + panjang);
        System.out.println("- Lebar   : " + lebar);
    }

    // Menghitung Luas Persegi Panjang
    public int getLuas() {
        return panjang * lebar;
    }

    // Menghitung Keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}