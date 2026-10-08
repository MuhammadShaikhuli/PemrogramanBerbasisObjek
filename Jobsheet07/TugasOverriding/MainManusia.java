public class MainManusia {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        System.out.println("--- Pemanggilan Dynamic Method Dispatch ---");
        m1.makan(); // Memanggil method makan() milik Manusia
        m2.makan(); // Memanggil method makan() milik Dosen
        m3.makan(); // Memanggil method makan() milik Mahasiswa
    }
}