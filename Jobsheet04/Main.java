public class Main {
    public static void main(String[] args) {
        // Membuat objek Event
        Event seminarIT = new Event(101, "Workshop Pemrograman Berbasis Objek", "25 Oktober 2026", 2);

        // Membuat objek Peserta
        Peserta p1 = new Peserta(1, "Andi Saputra", "andi@email.com");
        Peserta p2 = new Peserta(2, "Budi Santoso", "budi@email.com");
        Peserta p3 = new Peserta(3, "Citra Lestari", "citra@email.com");

        // Menguji pendaftaran peserta (memanfaatkan ArrayList of Object di dalam Event)
        seminarIT.tambahPeserta(p1);
        seminarIT.tambahPeserta(p2);
        
        // Menguji batas kapasitas maksimal (seharusnya ditolak)
        seminarIT.tambahPeserta(p3);

        // Menampilkan detail event
        seminarIT.tampilkanDetailEvent();

        // Membuat objek Sertifikat untuk peserta yang valid (misal: Andi)
        Sertifikat sertifikatAndi = new Sertifikat("CERT-2026-001", "26 Oktober 2026", p1.getId(), seminarIT.getId());
        
        // Menampilkan informasi sertifikat
        sertifikatAndi.tampilkanSertifikat();
    }
}